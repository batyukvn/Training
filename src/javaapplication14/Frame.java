package javaapplication14;

import javax.swing.JOptionPane;

public class Frame extends javax.swing.JFrame {


    public Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("NOD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("SortArr");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int i;
        int A=Integer.valueOf(jTextField1.getText());
        int B=Integer.valueOf(jTextField2.getText());
        int[] OneA =new int[A+1];
        int res=0;
        int k=0;
                
        
        for (i=1; i<=A; i++)
        {
            int M=A%i;
            if (M==0) {
                OneA[k]=i;
                k++; }
                       
        }
        
         for (int j=1; j<=B; j++)
        {
            int M=B%j;
            if (M==0) 
            for(i=0; i<OneA.length; i++)
            {
                //JOptionPane.showMessageDialog(null, "Второй цикл "+OneA[i], "Result ", JOptionPane.PLAIN_MESSAGE);
                if (OneA[i]==j)
                res=Math.max(res, j);        
            }
                       
        }
         JOptionPane.showMessageDialog(null, "res "+res, "Result ", JOptionPane.PLAIN_MESSAGE);
        
        
        
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        int[] arr={3, 6 , 1, 2, 5};
        int A;
        //while(i==arr1.length-1){
        
        for(int i=0; i<arr.length;i++)
        {
          //JOptionPane.showMessageDialog(null, "1: "+arr[0]+", "+arr[1]+", "+arr[2]+", "+arr[3]+", "+arr[4], "Result ", JOptionPane.PLAIN_MESSAGE);
            for(int j=0; j<arr.length-1; j++)
            {
                
               // JOptionPane.showMessageDialog(null, "Array"+i+": "+arr[0]+", "+arr[1]+", "+arr[2]+", "+arr[3]+", "+arr[4], "Result ", JOptionPane.PLAIN_MESSAGE);
                //JOptionPane.showMessageDialog(null, "ggg: "+arr[j]+", "+arr[j+1], "Result ", JOptionPane.PLAIN_MESSAGE); 
                if(arr[j]>arr[j+1])
                {
                   
                   A=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=A;
                }
                    
            
            }
            
           
        }
        
          JOptionPane.showMessageDialog(null, "ГОТОВО: "+arr[0]+", "+arr[1]+", "+arr[2]+", "+arr[3]+", "+arr[4], "Result ", JOptionPane.PLAIN_MESSAGE);  
            
        


        
    
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
                /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
