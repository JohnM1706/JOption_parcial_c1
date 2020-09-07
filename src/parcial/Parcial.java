
package parcial;

import javax.swing.JOptionPane;


public class Parcial {

    
    public static void main(String[] args) {
        
        float pago,costo=0,valor,auxiliar=0;
        int eleccion=0,numero_productos;
        
        do{
            try{
                eleccion=Integer.parseInt(JOptionPane.showInputDialog("1.COMPRA DE PRODUCTO"+"\n2.SALIR"));
                switch(eleccion){
                    case 1:
                            numero_productos=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE PRODUCTOS QUE DESEA REGISTRAR "));
                            for(int i=0;i<numero_productos;i++){
                                
                                costo=Float.parseFloat(JOptionPane.showInputDialog(" INGRESE EL COSTO DEL "+(i+1)+" PRODUCTO "));
                                pago=Float.parseFloat(JOptionPane.showInputDialog(" INGRESE EL PAGO DEL "+(i+1)+" PRODUCTO "));
                            
                            if(costo == pago ){
                                JOptionPane.showMessageDialog(null," EL PAGO DEL PRODUCTO ES EXACTO"+"\nGRACIAS POR SU COMPRA ");
                            }else{
                                  if(pago > costo ){
                                  valor=pago-costo;
                                  JOptionPane.showMessageDialog(null," LAS VUELTAS SON DEL PRODUCTO COMPRARDO "+valor+"\nGRACIAS POR SU COMPRA ");
                                 }else{
                                   valor=costo-pago;
                                   JOptionPane.showMessageDialog(null," FALTA "+valor+"\nPARA EL PAGO DEL PRODUCTO POR FAVOR REALIZAR LA COMPRA OTRA VEZ ");
                                 }
                             } 
                                auxiliar=costo+costo;
                            }
                            JOptionPane.showMessageDialog(null,"EL TOTAL PAGADO POR "+numero_productos+ "PRODUCTOS ES "+auxiliar+"\nGRACIAS POR SU COMPRA");
                    break;
                    default:
                        JOptionPane.showMessageDialog(null,"MUCHAS GRACIAS");
                        
                }
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"USTED SELECCIONO CANCELAR ");
            }
        }while(eleccion != 2);
         
    }
    
}
