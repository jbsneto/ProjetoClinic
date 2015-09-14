/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.util;

import br.com.clinic.model.CidadeEstado;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author GENPAC
 */
public class LerXlsx {

    private static FileInputStream fisPlanilha = null;
    private static File file = null;
    private static CidadeEstado cidade;

    public static List<CidadeEstado> getXlsx() throws FileNotFoundException, IOException {

        List<CidadeEstado> list = new ArrayList<CidadeEstado>();
        int op;
        file = new File("C:\\CidadeEstado.xlsx");
        fisPlanilha = new FileInputStream(file);

        //cria um workbook = planilha toda com todas as abas
        XSSFWorkbook workbook = new XSSFWorkbook(fisPlanilha);

        //recuperamos apenas a primeira aba ou primeira planilha
        XSSFSheet sheet = workbook.getSheetAt(0);

        //retorna todas as linhas da planilha 0 (aba 1)
        Iterator<Row> rowIterator = sheet.iterator();

        //varre todas as linhas da planilha 0
        while (rowIterator.hasNext()) {

            //recebe cada linha da planilha
            Row row = rowIterator.next();

            //pegamos todas as celulas desta linha
            Iterator<Cell> cellIterator = row.iterator();

            cidade = new CidadeEstado();
            op = 1;
            //varremos todas as celulas da linha atual
            while (cellIterator.hasNext()) {

                //criamos uma celula
                Cell cell = cellIterator.next();

                switch (op) {

                    case 1:
                        cidade.setNomeEstado(cell.getStringCellValue());
                        break;
                    case 2:
                        cidade.setCodEstado(Double.toString(cell.getNumericCellValue()));
                        break;
                    case 3:
                        cidade.setCodCidade(cell.getStringCellValue());
                        break;
                    case 4:
                        cidade.setNomeCidade(cell.getStringCellValue());
                        break;

                        
                }
                op++;
            }
            list.add(cidade);
        }
        return list;
    }

}
