/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.util;

import br.com.clinic.facade.Facade;
import br.com.clinic.model.CidadeEstado;
import br.com.clinic.model.LogExame;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import static org.apache.poi.hssf.usermodel.HeaderFooter.date;

/**
 *
 * @author GENPAC
 */
public class Util {
    
    private static final String op[] = {"PENDENTE", "COLETADO", "EXAMINADO", "ENTREGUE", "EXTRAVIADO"};
    private static final DateFormat FORMATBR = new SimpleDateFormat("dd/MM/yyyy");
    private static Facade facade = new Facade();
    
    public static String getStatusPendente(){ return op[0]; }
    public static String getStatusColetado(){ return op[1]; }
    public static String getStatusExaminado(){ return op[2]; }
    public static String getStatusEntregue(){ return op[3]; }
    public static String getStatusExtraviado(){ return  op[4]; }
    
    public static Date getDataAtual(){
        Date now = new Date();
        return now;
    }

    public static String dateToString(Date date){
        if (date == null)
            return null;
        return FORMATBR.format(date);
    }

    public static Date stringToDate(String str){
        if (str == null || str.equals(""))
            return null;
        try {
            return FORMATBR.parse(str);
        } catch (ParseException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void geraRelatorioLog(List<LogExame> list) {

        JasperReport report;
        try {
            report = JasperCompileManager.compileReport("relatorios/log.jrxml");

            // preenchimento do relatorio  
            JasperPrint print = JasperFillManager.fillReport(report, null, new JRBeanCollectionDataSource(list));

            // exportar relatório para formato PDF  
            JasperExportManager.exportReportToPdfFile(print, "relatorios/log.pdf");
        } catch (JRException ex) {
            ex.printStackTrace();
            System.out.println("Erro: " + ex.getMessage());
        }
    }

}
