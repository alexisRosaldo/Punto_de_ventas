/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Alexis
 */
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
 
public class FacturaPDF {
    
    public void generarFacturaDetallada(ArrayList<Producto> listaProductos, FacturaDetallada facturaDetallada){
        Document document = new Document(PageSize.A5,20,20,20,20);
        Calendar calendario = new GregorianCalendar();
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minutos = calendario.get(Calendar.MINUTE);
        int segundos = calendario.get(Calendar.SECOND);
        
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFacturacion = (String) dateFormat.format(date);
        fechaFacturacion = fechaFacturacion.replace('/', '_');
        String clavePDF = "_" + hora + "_" + minutos + "_" + segundos + "__" + fechaFacturacion;
        
        try {
            PdfWriter.getInstance(document, new FileOutputStream("facturaNo " + clavePDF + ".pdf"));
            document.open();
            Paragraph parrafo = new Paragraph();
            parrafo.add("           FACTURA-PUNTO-DE-VENTAS");
            parrafo.add("\n");
            parrafo.add("\n");
            parrafo.add("\n");
            parrafo.add("ID Factura:  " + facturaDetallada.getId() + "                      Fecha: " + facturaDetallada.getFechaFactura());
            parrafo.add("\n");
            parrafo.add("\n");
            parrafo.add("ID del vendedor:  " + facturaDetallada.getIdUsuario());
            parrafo.add("\n");
            parrafo.add("\n");
            parrafo.add("Nombre del comprador:  " + facturaDetallada.getNombreCliente());
            parrafo.add("\n");
            parrafo.add("\n");
            parrafo.add("Descripcción:  " + facturaDetallada.getDescripccion());
            parrafo.add("\n");
            parrafo.add("\n");

            PdfPTable table = new PdfPTable(4);

            Paragraph columna1 = new Paragraph("ID");
            columna1.getFont().setStyle(Font.BOLD);
            columna1.getFont().setSize(10);
            table.addCell(columna1);

            Paragraph columna2 = new Paragraph("Nombre del Producto");
            columna2.getFont().setStyle(Font.BOLD);
            columna2.getFont().setSize(10);
            table.addCell(columna2);

            Paragraph columna3 = new Paragraph("Precio");
            columna3.getFont().setStyle(Font.BOLD);
            columna3.getFont().setSize(10);
            table.addCell(columna3);

            Paragraph columna4 = new Paragraph("Cantidad");
            columna4.getFont().setStyle(Font.BOLD);
            columna4.getFont().setSize(10);
            table.addCell(columna4);


            // addCell() agrega una celda a la tabla, el cambio de fila
            // ocurre automaticamente al llenar la fila
            double montoTotalCompra = 0;
            for (int i = 0; i < listaProductos.size(); i++) {
                //JOptionPane.showMessageDialog(null, "Cantidad de productos" + i);
                if (listaProductos.get(i) instanceof Producto) {
                    Producto abarrotes = (Producto) listaProductos.get(i);
                    
                    Paragraph columna01 = new Paragraph("" + abarrotes.getId());
                    columna01.getFont().setStyle(Font.SANS_SERIF);
                    columna01.getFont().setSize(10);
                    table.addCell(columna01);

                    Paragraph columna02 = new Paragraph(abarrotes.getNombre());
                    columna02.getFont().setStyle(Font.SANS_SERIF);
                    columna02.getFont().setSize(10);
                    table.addCell(columna02);

                    Paragraph columna03 = new Paragraph("" + abarrotes.getPrecio());
                    columna03.getFont().setStyle(Font.SANS_SERIF);
                    columna03.getFont().setSize(10);
                    table.addCell(columna03);

                    Paragraph columna04 = new Paragraph("" + abarrotes.getCantidad());
                    columna04.getFont().setStyle(Font.SANS_SERIF);
                    columna04.getFont().setSize(10);
                    table.addCell(columna04);
                    
                    montoTotalCompra += abarrotes.calcularMonto();
                }
            }
            
            Paragraph parrafo2 = new Paragraph();
            parrafo2.add("\n");
            parrafo2.add("\n");
            parrafo2.add("Monto total:                               $  " + montoTotalCompra);
            parrafo2.add("\n");
            parrafo2.add("\n");
            
            PdfPTable table2 = new PdfPTable(1);
            Paragraph columnaFinal = new Paragraph("Monto total  =  $  " + montoTotalCompra);
            columnaFinal.getFont().setStyle(Font.BOLD);
            columnaFinal.getFont().setSize(10);
            table2.addCell(columnaFinal);
            PdfPCell celdaFinal = new PdfPCell(new Paragraph("Monto total  =  $  " + montoTotalCompra));
            celdaFinal.setColspan(1);
               
            document.add(parrafo);
            document.add(table);
            document.add(parrafo2);
            table.addCell(celdaFinal); 
            document.close();
        } catch (Exception e) {
            System.err.println("Ocurrio un error al crear el archivo");
            System.exit(-1);
        }
    }

    //https://es.stackoverflow.com/questions/41609/tratado-de-atributos-tabla-pdftable-java-itext

}
