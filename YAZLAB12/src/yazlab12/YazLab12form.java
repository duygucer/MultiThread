package yazlab12;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author Duygu
 */

//Sub thread nesnesi oluşturmak için gerekli class
class SubThreadsOlustur {

    public int ChildThread = 0;

    public synchronized int getChildThread() {
        return ChildThread;
    }

    public synchronized void setChildThread(int ChildThread) {
        this.ChildThread = ChildThread;
    }

}
//JFrame 
public class YazLab12form extends javax.swing.JFrame {

    ArrayList<Integer> childs = new ArrayList<Integer>();
    private int Thistek = 0;
    private int Th1istek = 0;
    private int Th2istek = 0;
    private int Th3istek = 0;
    private int Th4istek = 0;
    private int istek = 0;

    public synchronized int getTh1istek() {
        return Th1istek;
    }

    public synchronized void setTh1istek(int Th1istek) {
        this.Th1istek = Th1istek;
    }

    public synchronized int getTh2istek() {
        return Th2istek;
    }

    public synchronized void setTh2istek(int Th2istek) {
        this.Th2istek = Th2istek;
    }

    public synchronized int getTh3istek() {
        return Th3istek;
    }

    public synchronized void setTh3istek(int Th3istek) {
        this.Th3istek = Th3istek;
    }

    public synchronized int getTh4istek() {
        return Th4istek;
    }

    public synchronized void setTh4istek(int Th4istek) {
        this.Th4istek = Th4istek;
    }
    int zaman = 0;

    public YazLab12form() {
        initComponents();
    }

    public synchronized int getIstek() {
        return istek;
    }

    public synchronized void setIstek(int istek) {
        this.istek = istek;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar5 = new javax.swing.JProgressBar();
        MainThreadProgress = new javax.swing.JProgressBar();
        SubThread5 = new javax.swing.JProgressBar();
        SubThread3 = new javax.swing.JProgressBar();
        SubThread1 = new javax.swing.JProgressBar();
        SubThread7 = new javax.swing.JProgressBar();
        SubThread4 = new javax.swing.JProgressBar();
        SubThread6 = new javax.swing.JProgressBar();
        SubThread8 = new javax.swing.JProgressBar();
        SubThread2 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        SubThread9 = new javax.swing.JProgressBar();
        SubThread10 = new javax.swing.JProgressBar();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(600, 300, 0, 0));
        setMinimumSize(new java.awt.Dimension(640, 450));
        setSize(new java.awt.Dimension(640, 392));

        MainThreadProgress.setStringPainted(true);

        SubThread5.setStringPainted(true);
        SubThread5.setVisible(false);

        SubThread3.setStringPainted(true);
        SubThread3.setVisible(false);

        SubThread1.setStringPainted(true);

        SubThread7.setStringPainted(true);
        SubThread7.setVisible(false);

        SubThread4.setStringPainted(true);
        SubThread4.setVisible(false);

        SubThread6.setStringPainted(true);
        SubThread6.setVisible(false);

        SubThread8.setStringPainted(true);
        SubThread8.setVisible(false);

        SubThread2.setStringPainted(true);

        jButton1.setText("Başlat");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Main Thread");

        jLabel2.setText("Sub Thread1");

        jLabel3.setText("Sub Thread2");

        jLabel4.setText("Sub Thread3");
        jLabel4.setVisible(false);

        jLabel6.setText("Sub Thread5");
        jLabel6.setVisible(false);

        jLabel5.setText("Sub Thread4");
        jLabel5.setVisible(false);

        jLabel7.setText("Sub Thread6");
        jLabel7.setVisible(false);

        jLabel8.setText("Sub Thread7");
        jLabel8.setVisible(false);

        jLabel9.setText("Sub Thread8");
        jLabel9.setVisible(false);

        SubThread9.setStringPainted(true);
        SubThread9.setVisible(false);

        SubThread10.setStringPainted(true);
        SubThread10.setVisible(false);

        jLabel10.setText("Sub Thread9");
        jLabel10.setVisible(false);

        jLabel11.setText("Sub Thread10");
        jLabel11.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(SubThread1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                                .addComponent(SubThread2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SubThread3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SubThread4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jButton1)
                                .addGap(43, 43, 43)
                                .addComponent(MainThreadProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(276, 276, 276)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SubThread5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SubThread6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(101, 101, 101))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SubThread7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SubThread8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SubThread9, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SubThread10, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MainThreadProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SubThread1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SubThread2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SubThread3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubThread4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubThread5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubThread6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubThread8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubThread7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubThread9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubThread10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//bütün progressbarların ilerlemesi burada kontrol edilir.
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (istek <= 10000) {
                    // Runs inside of the Swing UI thread
                    SwingUtilities.invokeLater(new Runnable() {
                        public void run() {

                            int x = (getIstek() / 100);
                            MainThreadProgress.setValue(x);
                            if (MainThreadProgress.getValue() > 99) {
                                System.out.println("10000 istek kapasitesine ulaşıldı.");
                            }

                            int y = (getTh1istek() / 50);
                            SubThread1.setValue(y);

                            int z = (getTh2istek() / 50);
                            SubThread2.setValue(z);

                            if (childs.size() >= 3) {
                                SubThread3.setVisible(true);
                                jLabel4.setVisible(true);
                                SubThread3.setValue(childs.get(2) / 50);
                            }
                            if (childs.size() >= 4) {
                                SubThread4.setVisible(true);
                                jLabel5.setVisible(true);
                                SubThread4.setValue(childs.get(3) / 50);
                            }
                            if (childs.size() >= 5) {
                                SubThread5.setVisible(true);
                                jLabel6.setVisible(true);
                                SubThread5.setValue(childs.get(4) / 50);
                            }
                            if (childs.size() >= 6) {
                                SubThread6.setVisible(true);
                                jLabel7.setVisible(true);
                                SubThread6.setValue(childs.get(5) / 50);
                            }
                            if (childs.size() >= 7) {
                                SubThread7.setVisible(true);
                                jLabel8.setVisible(true);
                                SubThread7.setValue(childs.get(6) / 50);
                            }
                            if (childs.size() >= 8) {
                                SubThread8.setVisible(true);
                                jLabel9.setVisible(true);
                                SubThread8.setValue(childs.get(7) / 50);
                            }
                            if (childs.size() >= 9) {
                                SubThread9.setVisible(true);
                                jLabel10.setVisible(true);
                                SubThread9.setValue(childs.get(8) / 50);
                            }
                            if (childs.size() >= 10) {
                                SubThread10.setVisible(true);
                                jLabel11.setVisible(true);
                                SubThread10.setValue(childs.get(9) / 50);
                            }
//Eğer bir sub thread istek değeri 0'a düşerse burada silinir.
                            for (int i = 2; i < childs.size(); i++) {
                                if (childs.get(i) == 0) {
                                    System.out.println((i+1)+". Child silindi!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                                    childs.remove(i);
                                    System.out.println("Child size: "+childs.size());
                                    if (i == 2 || 2==childs.size()+1 || 2==childs.size()+2) {
                                        SubThread3.setVisible(false);
                                        jLabel4.setVisible(false);
                                    }
                                    if (i == 3 || 3==childs.size()+1 || 3==childs.size()+2) {
                                        SubThread4.setVisible(false);
                                        jLabel5.setVisible(false);
                                    }
                                    if (i == 4 || 4==childs.size()+1 || 4==childs.size()+2) {
                                        SubThread5.setVisible(false);
                                        jLabel6.setVisible(false);
                                    }
                                    if (i == 5 || 5==childs.size()+1 || 5==childs.size()+2) {
                                        SubThread6.setVisible(false);
                                        jLabel7.setVisible(false);
                                    }
                                    if (i == 6 || 6==childs.size()+1 || 6==childs.size()+2) {
                                        SubThread7.setVisible(false);
                                        jLabel8.setVisible(false);
                                    }
                                    if (i == 7 || 7==childs.size()+1 || 7==childs.size()+2) {
                                        SubThread8.setVisible(false);
                                        jLabel9.setVisible(false);
                                    }
                                    if (i == 8 || 8==childs.size()+1 || 8==childs.size()+2) {
                                        SubThread9.setVisible(false);
                                        jLabel10.setVisible(false);
                                    }
                                    if (i == 9 || 9==childs.size()+1 || 9==childs.size()+2) {
                                        SubThread10.setVisible(false);
                                        jLabel11.setVisible(false);
                                    }
                                }
                            }

                        }
                    });
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(YazLab12form.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();

    }//GEN-LAST:event_jButton1ActionPerformed
//Main Thread için istek oluşturur.
    public void istekOlustur() {
        Random r = new Random();
        int x = r.nextInt(1001);
        if (getIstek() + x < 10000) {
            System.out.println("Yeni gelen istek: " + x);
            setIstek(getIstek() + x);
        } else {
            System.out.println("Kuyruk dolu...");
            setIstek(10000);
        }
    }
//Main Thread istek yanıtlar.
    public void istekYanıtla() {
        if (getIstek() > 0) {
            Random r = new Random();
            int y = r.nextInt(51);
            if (getIstek() > y) {
                System.out.println("Yanıtlanan istek: " + y);
                setIstek(getIstek() - y);
            } else {
                System.out.println("Yanıtlanan istek: " + getIstek());
                setIstek(0);
            }
        } else {
            System.out.println("Yanıtlanacak istek yok...");
        }
    }
//Main Thread
    public static void main(String args[]) {
        YazLab12form mainThread = new YazLab12form();
        mainThread.setVisible(true);
        mainThread.childs.add(mainThread.getTh1istek());
        mainThread.childs.add(mainThread.getTh2istek());
        mainThread.CreateSubThread();
        mainThread.SubThreads(null);

        while (true) {
            try {
                Thread.sleep(100);
                mainThread.zaman += 100;
                System.out.println("Geçen zaman: " + mainThread.zaman);
                if (mainThread.zaman % 500 == 0) {
                    mainThread.istekOlustur();
                    System.out.println("İstek sayısı: " + mainThread.getIstek());
                }
                if (mainThread.zaman % 200 == 0) {
                    mainThread.istekYanıtla();
                    System.out.println("İstek sayısı: " + mainThread.getIstek());
                }

            } catch (InterruptedException ex) {
                Logger.getLogger(YazLab12form.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

//Sub Threadler için main threadden istek alma
    public synchronized int subThreadIstekAl(int x, int ThIstek) {

        if (x > getIstek()) {
            Thistek = ThIstek + getIstek();
            setIstek(0);
        } else {
            setIstek(getIstek() - x);
            Thistek = ThIstek + x;
        }
        return Thistek;
    }

//Sub Thread işlemleri
    public void SubThreads(SubThreadsOlustur x) {
        childs.set(0, getTh1istek());
        childs.set(0, getTh2istek());

        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(YazLab12form.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (zaman % 500 == 0) {
                        Random r = new Random();
                        int x = r.nextInt(201);

                        System.out.println("SubThread1, Alınan istek: " + x);
                        if (getTh1istek() <= 5000) {
                            setTh1istek(subThreadIstekAl(x, getTh1istek()));
                            System.out.println("SubThread1 istek sayısı: " + getTh1istek());
                            childs.set(0, getTh1istek());
                        } else {
                            System.out.println("SubThread1 kapasitesi dolu..");
                        }
                    }
                    if (zaman % 300 == 0 && getTh1istek() > 0) {
                        Random r = new Random();
                        int y = r.nextInt(31);

                        if (getTh1istek() - y < 0) {
                            System.out.println("SubThread1, Yanıtlanan istek: " + (y - getTh1istek()));
                            setTh1istek(0);
                            System.out.println("SubThread1 istek sayısı: " + getTh1istek());
                            childs.set(0, getTh1istek());
                        } else {
                            System.out.println("SubThread1, Yanıtlanan istek: " + y);
                            setTh1istek(getTh1istek() - y);
                            System.out.println("SubThread1 istek sayısı: " + getTh1istek());
                            childs.set(0, getTh1istek());
                        }
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(YazLab12form.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (zaman % 500 == 0) {
                        Random r = new Random();
                        int x = r.nextInt(201);
                        System.out.println("SubThread2, Alınan istek: " + x);
                        if (getTh2istek() <= 5000) {
                            setTh2istek(subThreadIstekAl(x, getTh2istek()));
                            System.out.println("SubThread2 istek sayısı: " + getTh2istek());
                            childs.set(1, getTh2istek());
                        } else {
                            System.out.println("SubThread2 kapasitesi dolu...");
                        }
                    }
                    if (zaman % 300 == 0 && getTh2istek() > 0) {
                        Random r = new Random();
                        int y = r.nextInt(31);
                        if (getTh2istek() - y < 0) {
                            System.out.println("SubThread2, Yanıtlanan istek: " + (y - getTh2istek()));
                            setTh2istek(0);
                            System.out.println("SubThread2 istek sayısı: " + getTh2istek());
                            childs.set(1, getTh2istek());
                        } else {
                            System.out.println("SubThread2, Yanıtlanan istek: " + y);
                            setTh2istek(getTh2istek() - y);
                            System.out.println("SubThread2 istek sayısı: " + getTh2istek());
                            childs.set(1, getTh2istek());
                        }
                    }
                }
            }
        });
//Yeni oluşan sub threadler
        if (x != null && x.getChildThread() != 0) {
            childs.add(x.getChildThread());
            System.out.println("--SubThread sayisi: " + childs.size());
            Thread thread5 = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(YazLab12form.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        for (int i = 2; i < childs.size(); i++) {
                            if (zaman % 500 == 0) {
                                Random r = new Random();
                                int z = r.nextInt(101);
                                System.out.println("SubThread" + (i + 1) + ", Alınan istek: " + z);
                                if (childs.get(i) <= 5000) {
                                    childs.set(i, subThreadIstekAl(z, childs.get(i)));
                                    System.out.println("SubThread" + (i + 1) + " istek sayısı: " + childs.get(i));
                                } else {
                                    System.out.println("SubThread" + (i + 1) + ", kapasitesi dolu...");
                                }
                            }
                            if (zaman % 300 == 0 && getTh2istek() > 0) {
                                Random r = new Random();
                                int y = r.nextInt(31);
                                if (childs.get(i) - y < 0) {                                    
                                    System.out.println("SubThread" + (i + 1) + ", Yanıtlanan istek: " + (y - childs.get(i)));
                                    childs.set(i, 0);
                                    System.out.println("SubThread" + (i + 1) + ", istek sayısı: " + childs.get(i));
                                } else {
                                    System.out.println("SubThread" + (i + 1) + ", Yanıtlanan istek: " + y);
                                    childs.set(i, childs.get(i) - y);
                                    System.out.println("SubThread" + (i + 1) + ", istek sayısı: " + childs.get(i));
                                }
                            }
                        }
                    }
                }
            });
            thread5.start();
        }
        thread1.start();
        thread2.start();
    }
   
//Eğer bir sub thread istek değeri %70 üzerine çıkarsa yeni sub thread oluşturulur.
    public void CreateSubThread() {

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {

                while (true) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(YazLab12form.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    for (int i = 0; i < childs.size(); i++) {
                        if ((childs.get(i) / 50) >= 70 && childs.size()<10) {
                            SubThreadsOlustur newchild = new SubThreadsOlustur();
                            int temp = childs.get(i) / 2;
                            newchild.setChildThread(temp);
                            if (i == 0 && getTh1istek() >= 3300) {
                                setTh1istek(getTh1istek() - temp);
                                System.out.println("New Th1istek: " + getTh1istek());
                                childs.set(0, getTh1istek());
                            }
                            if (i == 1 && getTh2istek() >= 3300) {
                                setTh2istek(getTh2istek() - temp);
                                System.out.println("New Th2istek: " + getTh2istek());
                                childs.set(1, getTh2istek());
                            }
                            if (i != 0 && i != 1) {
                                childs.set(i, childs.get(i) - temp);
                            }
                            System.out.println((childs.size() + 1) + ". Child Oluşturuldu");
                            SubThreads(newchild);
                        }
                    }

                }
            }
        });
        thread3.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar MainThreadProgress;
    private javax.swing.JProgressBar SubThread1;
    private javax.swing.JProgressBar SubThread10;
    private javax.swing.JProgressBar SubThread2;
    private javax.swing.JProgressBar SubThread3;
    private javax.swing.JProgressBar SubThread4;
    private javax.swing.JProgressBar SubThread5;
    private javax.swing.JProgressBar SubThread6;
    private javax.swing.JProgressBar SubThread7;
    private javax.swing.JProgressBar SubThread8;
    private javax.swing.JProgressBar SubThread9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar5;
    // End of variables declaration//GEN-END:variables
}