package hust.soict.globalict.aims;


import hust.soict.globalict.aims.order.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.naming.LimitExceededException;
import javax.swing.*;

import hust.soict.globalict.aims.media.*;



public class Aims extends JFrame{
	public Aims() {
		 initUI();
    }

    public final void initUI() {
	    setTitle("Menu Order");
    	ArrayList<Order> myOrders = new ArrayList<>();
        JPanel panel = new JPanel();
        panel.setBounds(0,0,200,900);
        panel.setBackground(Color.LIGHT_GRAY);
        JPanel jPanelRight = new JPanel();
        CardLayout cardLayout = new CardLayout();
        
        //create MenuOptions

        JTextField notification = new JTextField();
        notification.setBounds(0,600,160,18);
        notification.setEditable(false);
        panel.add(notification);


        JLabel optionJLabel = new JLabel("Options");
        optionJLabel.setBounds(0,0,70,20);
        panel.add(optionJLabel);

        JButton createButton = new JButton("Create new Order");
        createButton.setBounds(10,50,150,25);
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                notification.setText("Create new Order");
                try {
                    myOrders.add(new Order());
                    JPanel a1 = new JPanel();
                    JTextField text = new JTextField("A orders was created");
                    text.setFont(new Font( "Time new roman", Font.PLAIN, 25 ));
                    text.setBounds( 100,300,400,50 );
                    text.setEditable( false );
                    a1.add(text);
                    a1.setLayout(null);

                    jPanelRight.add(a1);
                    cardLayout.next( jPanelRight );
                } catch (LimitExceededException i) {
                	JPanel a1 = new JPanel();
                    JTextField text1 = new JTextField("Can not create new Orders!");
                    text1.setEditable(false);
                    text1.setFont( new Font( "Time new Roman",Font.PLAIN,25 ) );
                    text1.setBounds( 20,30,700,50 );
                    JTextField text2 = new JTextField("Because the number of order is limited.");
                    text2.setEditable(false);
                    text2.setFont( new Font( "Time new Roman",Font.PLAIN,25 ) );
                    text2.setBounds( 20,100 ,700,50);
                    a1.add(text1);
                    a1.add(text2);
                    a1.setLayout(null);
                    a1.setVisible( true );
                    jPanelRight.add("zzzz",a1);
                    cardLayout.show( jPanelRight,"zzzz" );
                }
            }
        });
        panel.add(createButton);

        JButton addItemsButton = new JButton("Add new Items");
        addItemsButton.setBounds(10,120,150,25);
        addItemsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                notification.setText("Add a new Item");
                if(myOrders.size() == 0){
                    JPanel a1 =new JPanel();
                    a1.setLayout(null);
                    a1.setVisible(true);
                    JTextField newtext = new JTextField("No Order was created");
                    newtext.setBounds(20,100,400,45);
                    newtext.setFont(new Font("Time new Roman", Font.PLAIN , 25));
                    newtext.setEditable(false);
                    JTextField advice = new JTextField("Please create a Order");
                    advice.setBounds(20,300,400,45);
                    advice.setFont(new Font("Time new Roman", Font.PLAIN, 25));
                    advice.setEditable(false);
                    a1.add(newtext);
                    a1.add(advice);
                    jPanelRight.add(a1);
                    cardLayout.next(jPanelRight);
                } else {
                    JPanel a1 = new JPanel();
                    int a = 10;
                    a1.setLayout(null);
                    a1.setVisible(true);
                    JTextField text1 = new JTextField("Choose a Order: ");
                    text1.setFont(new Font("Time new roman", Font.PLAIN, 20));
                    text1.setEditable(false);
                    text1.setBounds(10, a, 200,45);
                    a1.add(text1);
                    for(int i = 0; i < myOrders.size(); i++){
                        JButton newButton = new JButton("Order[" + (i+1) + "]");
                        newButton.setBounds(10,a + 70*(i+1), 200,45);
                        int finalI = i;
                        newButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JPanel a2 = new JPanel();
                                a2.setLayout(null);
                                a2.setVisible(true);
                                JTextField text2 = new JTextField("Add item in Order[" + (finalI + 1) + "]");
                                text2.setBounds(10,a,200,45);
                                text2.setEditable(false);
                                text2.setFont(new Font("Time new roman", Font.PLAIN, 20));
                                a2.add(text2);

                                JTextField text3 = new JTextField("Choose your option: ");
                                text3.setBounds(10,a + 60,200,45);
                                text3.setEditable(false);
                                text3.setFont(new Font("Time new roman", Font.PLAIN, 20));
                                a2.add(text3);

                                JButton digital = new JButton("Digital Video Disc");
                                digital.setBounds(10, 150, 200,45);
                                digital.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                    	JPanel a3 = new JPanel();
                                    	a3.setLayout(null);
                                    	a3.setVisible(true);
                                        JTextField text4 = new JTextField("Add item in Order[" + (finalI + 1) + "]");
                                        text4.setBounds(10,10,200,40);
                                        text4.setEditable(false);
                                    	a3.add(text4);

                                        JTextField text5 = new JTextField("Enter the title: ");
                                        text5.setBounds(10,70,200,40);
                                        text5.setEditable(false);
                                        JTextField text6 = new JTextField();
                                        text6.setBounds(210,70, 400,40);
                                        a3.add(text5);
                                        a3.add(text6);

                                        JTextField text7 = new JTextField("Enter the category: ");
                                        text7.setBounds(10,130,200,40);
                                        text7.setEditable(false);
                                        JTextField text8 = new JTextField();
                                        text8.setBounds(210,130, 400,40);
                                        a3.add(text7);
                                        a3.add(text8);

                                        JTextField text9 = new JTextField("Enter the director: ");
                                        text9.setBounds(10,190,200,40);
                                        text9.setEditable(false);
                                        JTextField text10 = new JTextField();
                                        text10.setBounds(210,190, 400,40);
                                        a3.add(text9);
                                        a3.add(text10);

                                        JTextField text11 = new JTextField("Enter the length: ");
                                        text11.setBounds(10,250,200,40);
                                        text11.setEditable(false);
                                        JTextField text12 = new JTextField();
                                        text12.setBounds(210,250, 400,40);
                                        a3.add(text11);
                                        a3.add(text12);

                                        JTextField text13 = new JTextField("Enter the cost: ");
                                        text13.setBounds(10,310,200,40);
                                        text13.setEditable(false);
                                        JTextField text14 = new JTextField();
                                        text14.setBounds(210,310, 400,40);
                                        a3.add(text13);
                                        a3.add(text14);

                                        JButton okla = new JButton("OKE!");
                                        okla.setBounds(200,600,100,40);
                                        okla.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                String title = text6.getText();
                                                String category = text8.getText();
                                                String director = text10.getText();
                                                int length = 0;
                                                int check = 0;
                                                float cost = 0;
                                                try{
                                                    length = Integer.parseInt(text12.getText());
                                                    try{
                                                        cost = Float.parseFloat(text14.getText());
                                                    } catch (NumberFormatException i){
                                                        JOptionPane.showMessageDialog(jPanelRight,"The cost which you enter is not valid! \n Please enter the cost.","Warning",JOptionPane.WARNING_MESSAGE);
                                                        check = 1;
                                                    }
                                                } catch (NumberFormatException i){
                                                    JOptionPane.showMessageDialog(jPanelRight,"The length which you enter is not valid \n Please enter the lenghth","Warning",JOptionPane.WARNING_MESSAGE);
                                                    check = 1;
                                                }
                                                if(check != 1){
                                                    DigitalVideoDisc digitala = new DigitalVideoDisc(title,category,director,length,cost);
                                                    myOrders.get(finalI).addMedia(digitala);
                                                    cardLayout.show(jPanelRight,"a2");
                                                    notification.setText("D-Disc was added in order");
                                                }

                                            }
                                        });
                                        a3.add(okla);
                                        jPanelRight.add("digital",a3);
                                        cardLayout.show(jPanelRight,"digital");
                                    }
                                });
                                a2.add(digital);

                                JButton book = new JButton("Book");
                                book.setBounds(10,250,200,45);
                                book.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JPanel a3 = new JPanel();
                                        a3.setLayout(null);
                                        a3.setVisible(true);
                                        JTextField text4 = new JTextField("Add item in Order[" + (finalI + 1) + "]");
                                        text4.setBounds(10,10,200,40);
                                        text4.setEditable(false);
                                        a3.add(text4);

                                        JTextField text5 = new JTextField("Enter the title: ");
                                        text5.setBounds(10,70,200,40);
                                        text5.setEditable(false);
                                        JTextField text6 = new JTextField();
                                        text6.setBounds(210,70, 400,40);
                                        a3.add(text5);
                                        a3.add(text6);

                                        JTextField text7 = new JTextField("Enter the category: ");
                                        text7.setBounds(10,130,200,40);
                                        text7.setEditable(false);
                                        JTextField text8 = new JTextField();
                                        text8.setBounds(210,130, 400,40);
                                        a3.add(text7);
                                        a3.add(text8);

                                        JTextField text13 = new JTextField("Enter the cost: ");
                                        text13.setBounds(10,190,200,40);
                                        text13.setEditable(false);
                                        JTextField text14 = new JTextField();
                                        text14.setBounds(210,190, 400,40);
                                        a3.add(text13);
                                        a3.add(text14);

                                        JTextField text9 = new JTextField("Enter authors(separated by (/)): ");
                                        text9.setBounds(10,250,220,40);
                                        text9.setEditable(false);
                                        JTextField text10 = new JTextField();
                                        text10.setBounds(10,300, 700,40);
                                        a3.add(text9);
                                        a3.add(text10);

                                        JButton okla = new JButton("OKE!");
                                        okla.setBounds(200,600,100,40);
                                        okla.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                notification.setText("Book was added in order");
                                                String title = text6.getText();
                                                String category = text8.getText();
                                                float cost = 0;
                                                int check = 0;
                                                try{
                                                    cost = Float.parseFloat(text14.getText());
                                                } catch (NumberFormatException i){
                                                    check = 1;
                                                    JOptionPane.showMessageDialog(jPanelRight,"The cost which you enter is not valid! \n Please enter the cost.","Warning",JOptionPane.WARNING_MESSAGE);
                                                }
                                                if(check != 1){
                                                    Book newBook = new Book(title,category,cost);
                                                    String[] author = text10.getText().split("/");
                                                    for(int i = 0; i < author.length; i++){
                                                        newBook.addAuthor(author[i]);
                                                    }
                                                    myOrders.get(finalI).addMedia(newBook);
                                                    cardLayout.show(jPanelRight,"a2");
                                                }
                                            }
                                        });
                                        a3.add(okla);
                                        jPanelRight.add("book",a3);
                                        cardLayout.show(jPanelRight,"book");
                                    }
                                });
                                a2.add(book);

                                JButton compact = new JButton("Compact Disc");
                                compact.setBounds(10,350,200,45);
                                compact.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JPanel a3 = new JPanel();
                                        a3.setLayout(null);
                                        a3.setVisible(true);
                                        JTextField text4 = new JTextField("Add item in Order[" + (finalI + 1) + "]");
                                        text4.setBounds(10,10,200,40);
                                        text4.setEditable(false);
                                        a3.add(text4);

                                        JTextField text5 = new JTextField("Enter the title: ");
                                        text5.setBounds(10,70,200,40);
                                        text5.setEditable(false);
                                        JTextField text6 = new JTextField();
                                        text6.setBounds(210,70, 400,40);
                                        a3.add(text5);
                                        a3.add(text6);

                                        JTextField text7 = new JTextField("Enter the category: ");
                                        text7.setBounds(10,130,200,40);
                                        text7.setEditable(false);
                                        JTextField text8 = new JTextField();
                                        text8.setBounds(210,130, 400,40);
                                        a3.add(text7);
                                        a3.add(text8);

                                        JTextField text9 = new JTextField("Enter the artist: ");
                                        text9.setBounds(10,190,200,40);
                                        text9.setEditable(false);
                                        JTextField text10 = new JTextField();
                                        text10.setBounds(210,190, 400,40);
                                        a3.add(text9);
                                        a3.add(text10);

                                        JTextField text11 = new JTextField("Enter the director: ");
                                        text11.setBounds(10,250,200,40);
                                        text11.setEditable(false);
                                        JTextField text12 = new JTextField();
                                        text12.setBounds(210,250, 400,40);
                                        a3.add(text11);
                                        a3.add(text12);

                                        JTextField text13 = new JTextField("Enter the cost: ");
                                        text13.setBounds(10,310,200,40);
                                        text13.setEditable(false);
                                        JTextField text14 = new JTextField();
                                        text14.setBounds(210,310, 400,40);
                                        a3.add(text13);
                                        a3.add(text14);

                                        JButton okla = new JButton("OKE!");
                                        okla.setBounds(200,600,100,40);
                                        okla.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                JPanel a4 = new JPanel();
                                                a4.setLayout(null);
                                                a4.setVisible(true);
                                                String title = text6.getText();
                                                String category = text8.getText();
                                                String artist = text10.getText();
                                                String director = text12.getText();
                                                float cost = 0;
                                                int check = 0;
                                                try{
                                                    cost = Float.parseFloat(text14.getText());
                                                } catch (NumberFormatException i){
                                                    check = 1;
                                                    JOptionPane.showMessageDialog(jPanelRight,"The cost which you enter is not valid! \n Please enter the cost.","Warning",JOptionPane.WARNING_MESSAGE);
                                                }
                                                if(check == 0){
                                                    CompactDisc cpdisc = new CompactDisc(title,category,director,cost, artist);
                                                    myOrders.get(finalI).addMedia(cpdisc);
                                                    JTextField optiontrack = new JTextField("Do you want to add more track?");
                                                    optiontrack.setEditable(false);
                                                    optiontrack.setBounds(20, 200,400,40);
                                                    optiontrack.setFont(new Font("Time new roman",Font.PLAIN,20));
                                                    a4.add(optiontrack);

                                                    JButton yess = new JButton("YES");
                                                    yess.setBounds(50,250,100,30);
                                                    yess.addActionListener(new ActionListener() {
                                                        @Override
                                                        public void actionPerformed(ActionEvent e) {
                                                            JPanel a5 = new JPanel();
                                                            a5.setLayout(null);
                                                            a5.setVisible(true);

                                                            JTextField text15 = new JTextField("Enter the title: ");
                                                            text15.setBounds(10,70,200,40);
                                                            text15.setEditable(false);
                                                            JTextField text16 = new JTextField();
                                                            text16.setBounds(210,70, 400,40);
                                                            a5.add(text15);
                                                            a5.add(text16);

                                                            JTextField text17 = new JTextField("Enter the length: ");
                                                            text17.setBounds(10,250,200,40);
                                                            text17.setEditable(false);
                                                            JTextField text18 = new JTextField();
                                                            text18.setBounds(210,250, 400,40);
                                                            a5.add(text17);
                                                            a5.add(text18);

                                                            JButton newbutton2 = new JButton("Oke");
                                                            newbutton2.setBounds(210,600,100,30);
                                                            newbutton2.addActionListener(new ActionListener() {
                                                                @Override
                                                                public void actionPerformed(ActionEvent e) {
                                                                    String titletrack = text16.getText();
                                                                    int lengthtrack = 0,check = 0;
                                                                    try{
                                                                        lengthtrack = Integer.parseInt(text18.getText());
                                                                    } catch (NumberFormatException i){
                                                                        JOptionPane.showMessageDialog(jPanelRight,"The length which you enter is not valid \n Please enter the lenghth","Warning",JOptionPane.WARNING_MESSAGE);
                                                                        check = 1;
                                                                    }
                                                                    if(check == 0){
                                                                        cpdisc.addTrack(new Track(titletrack,lengthtrack));
                                                                        cardLayout.show(jPanelRight,"track");
                                                                    }
                                                                }
                                                            });
                                                            a5.add(newbutton2);
                                                            jPanelRight.add("entertrack",a5);
                                                            cardLayout.show(jPanelRight,"entertrack");
                                                        }
                                                    });
                                                    a4.add(yess);

                                                    JButton no = new JButton("NO");
                                                    no.addActionListener(new ActionListener() {
                                                        @Override
                                                        public void actionPerformed(ActionEvent e) {
                                                            cardLayout.show(jPanelRight,"a2");
                                                        }
                                                    });
                                                    no.setBounds(200,250,100,30);
                                                    a4.add(no);

                                                    jPanelRight.add("track",a4);
                                                    cardLayout.show(jPanelRight,"track");
                                                    notification.setText("Compact was added in order");
                                                }
                                            }
                                        });
                                        a3.add(okla);
                                        jPanelRight.add("Compact",a3);
                                        cardLayout.show(jPanelRight,"Compact");
                                    }
                                });
                                a2.add(compact);

                                JButton exitt = new JButton("Exit");
                                exitt.setBounds(10,450,200,45);
                                exitt.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        notification.setText("");
                                        cardLayout.show(jPanelRight,"nulll");
                                    }
                                });
                                a2.add(exitt);
                                jPanelRight.add("a2",a2);
                                cardLayout.show(jPanelRight,"a2");
                            }
                        });
                        a1.add(newButton);
                    }
                    jPanelRight.add(a1);
                    cardLayout.next(jPanelRight);

                }
            }
        });
        panel.add(addItemsButton);
        
        JButton SortButton = new JButton("Sorts the Orders");
        SortButton.setBounds(10,190,150,25);
        SortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                notification.setText("The Order was sorted");
                if(myOrders.size() == 0){
                    JPanel a1 =new JPanel();
                    a1.setLayout(null);
                    a1.setVisible(true);
                    JTextField newtext = new JTextField("No Order was created");
                    newtext.setBounds(20,100,400,45);
                    newtext.setFont(new Font("Time new Roman", Font.PLAIN , 25));
                    newtext.setEditable(false);
                    JTextField advice = new JTextField("Please create a Order");
                    advice.setBounds(20,300,400,45);
                    advice.setFont(new Font("Time new Roman", Font.PLAIN, 25));
                    advice.setEditable(false);
                    a1.add(newtext);
                    a1.add(advice);
                    jPanelRight.add("abc1",a1);
                    cardLayout.show(jPanelRight, "abc1");
                } else {
                    JPanel a1 = new JPanel();
                    a1.setLayout(null);
                    a1.setVisible(true);
                    JTextField text1 = new JTextField("Choose a Order: ");
                    text1.setFont(new Font("Time new roman", Font.PLAIN, 20));
                    text1.setEditable(false);
                    text1.setBounds(10, 10, 200,45);
                    a1.add(text1);
                    for(int i = 0; i < myOrders.size(); i++){
                        JButton newButton1 = new JButton("Order[" + (i+1) + "]");
                        newButton1.setBounds(10,10 + 70*(i+1), 200,45);
                        int finalI = i;
                        newButton1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JPanel newpanel1 = new JPanel();
                                myOrders.get(finalI).sortMedia();
                                JTextField textfield = new JTextField("Order[" + (finalI + 1) + "] was sorted.");
                                textfield.setEditable(false);
                                textfield.setBounds(10,10,400,40);
                                textfield.setFont(new Font("Time new roman",Font.PLAIN, 24));
                                newpanel1.add(textfield);

                                JButton exittt = new JButton("Exit");
                                exittt.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        notification.setText("");
                                        cardLayout.show(jPanelRight,"nulll");
                                    }
                                });
                                exittt.setBounds(200,600,100,40);
                                newpanel1.add(exittt);
                                newpanel1.setLayout(null);
                                newpanel1.setSize(780,700);
                                jPanelRight.add("sort",newpanel1);
                                cardLayout.show(jPanelRight, "sort");
                            }
                        });
                        a1.add(newButton1);
                    }
                    jPanelRight.add("Sort",a1);
                    cardLayout.show(jPanelRight, "Sort");

                }
            }
        });
        panel.add(SortButton);
        
        JButton displayButton = new JButton("Display the Order");
        displayButton.setBounds(10,260,150,25);
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                notification.setText("Display the Order");
                if(myOrders.size() == 0){
                    JPanel a1 =new JPanel();
                    a1.setLayout(null);
                    a1.setVisible(true);
                    JTextField newtext = new JTextField("No Order was created");
                    newtext.setBounds(20,100,400,45);
                    newtext.setFont(new Font("Time new Roman", Font.PLAIN , 25));
                    newtext.setEditable(false);
                    JTextField advice = new JTextField("Please create a Order");
                    advice.setBounds(20,300,400,45);
                    advice.setFont(new Font("Time new Roman", Font.PLAIN, 25));
                    advice.setEditable(false);
                    a1.add(newtext);
                    a1.add(advice);
                    jPanelRight.add("abc",a1);
                    cardLayout.show(jPanelRight, "abc");
                } else {
                    JPanel a1 = new JPanel();
                    a1.setLayout(null);
                    a1.setVisible(true);
                    JTextField text1 = new JTextField("Choose a Order: ");
                    text1.setFont(new Font("Time new roman", Font.PLAIN, 20));
                    text1.setEditable(false);
                    text1.setBounds(10, 10, 200,45);
                    a1.add(text1);
                    for(int i = 0; i < myOrders.size(); i++){
                        JButton newButton1 = new JButton("Order[" + (i+1) + "]");
                        newButton1.setBounds(10,10 + 70*(i+1), 200,45);
                        int finalI = i;
                        newButton1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JPanel newpanel1 = new JPanel();

                                JTextField textfield = new JTextField("Order[" + (finalI + 1) + "] :");
                                textfield.setEditable(false);
                                textfield.setBounds(10,10,200,40);
                                textfield.setFont(new Font("Time new roman",Font.PLAIN, 19));
                                newpanel1.add(textfield);

                                ArrayList<Media> media3 = myOrders.get(finalI).getItemsOrdered();
                                for(int i = 0; i < media3.size(); i++){
                                	int ono = i;
                                    JTextField textt = new JTextField(media3.get(i).strdisplay());
                                    textt.setEditable(false);
                                    textt.setFont(new Font("Time new roman",Font.PLAIN, 18));
                                    textt.setBounds(10, 70 + i * 70, 680,40);
                                    newpanel1.add(textt);
                                    if(media3.get(i) instanceof CompactDisc) {
                                    	JButton playButton = new JButton("Play");
                                    	playButton.setBounds(690, 70 + i*70, 100,40);
                                    	playButton.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {
												try {
													
													CompactDisc cDisc = (CompactDisc) media3.get(ono);
													ArrayList<Track> arraytrack = (ArrayList<Track>) cDisc.getTracks();
													Track nextTrack;
													Iterator<Track> iter = arraytrack.iterator();
													while(iter.hasNext()) {
														nextTrack = (Track) iter.next();
														try {
															nextTrack.play();
															JOptionPane.showMessageDialog(jPanelRight, "Playing Track: " +nextTrack.getTitle() + "\nTrack length: " + nextTrack.getLength(), "Playing CD", JOptionPane.OK_OPTION);
														}catch(PlayerException exx) {
																throw exx;
														}
													}
												} catch(PlayerException excep) {
													JOptionPane.showMessageDialog(jPanelRight, "ERROR: track length can't be non-positive","Warning",JOptionPane.WARNING_MESSAGE);
												}
											}
										});
                                    	newpanel1.add(playButton);
                                    } else if(media3.get(ono) instanceof DigitalVideoDisc) {
                                    	JButton playButton = new JButton("Play");
                                    	playButton.setBounds(690, 70 + i*70, 100,40);
                                    	playButton.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {
												try {
													DigitalVideoDisc alain= ((DigitalVideoDisc) media3.get(ono));
													alain.play();
													JOptionPane.showMessageDialog(jPanelRight, "Playing DVD: " + alain.getTitle() + "\nDVD length: " + alain.getLength(),"Playing DVD", JOptionPane.OK_OPTION);
												} catch(PlayerException excep) {
													JOptionPane.showMessageDialog(jPanelRight, "ERROR: track length can't be non-positive","Warning",JOptionPane.WARNING_MESSAGE);
												}
											}
										});
                                    	newpanel1.add(playButton);
                                    }
                                }

                                JButton exittt = new JButton("Exit");
                                exittt.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        notification.setText("");
                                        cardLayout.show(jPanelRight,"nulll");
                                    }
                                });
                                newpanel1.add(exittt);
                                newpanel1.setLayout(null);
                                newpanel1.setSize(780,700);
                                jPanelRight.add("display",newpanel1);
                                cardLayout.show(jPanelRight, "display");
                            }
                        });
                        a1.add(newButton1);
                    }
                    jPanelRight.add("mono",a1);
                    cardLayout.show(jPanelRight, "mono");

                }
            }
        });
        panel.add(displayButton);

        JButton deleteOrder = new JButton("Delete Order");
        deleteOrder.setBounds(10,400,150,25);
        deleteOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(myOrders.size() == 0){
                    JPanel a1 =new JPanel();
                    a1.setLayout(null);
                    a1.setVisible(true);
                    JTextField newtext = new JTextField("No Order was created");
                    newtext.setBounds(20,100,400,45);
                    newtext.setFont(new Font("Time new Roman", Font.PLAIN , 25));
                    newtext.setEditable(false);
                    JTextField advice = new JTextField("Please create a Order");
                    advice.setBounds(20,300,400,45);
                    advice.setFont(new Font("Time new Roman", Font.PLAIN, 25));
                    advice.setEditable(false);
                    a1.add(newtext);
                    a1.add(advice);
                    jPanelRight.add("abc1",a1);
                    cardLayout.show(jPanelRight, "abc1");
                } else {
                    JPanel a1 = new JPanel();
                    a1.setLayout(null);
                    a1.setVisible(true);
                    JTextField text1 = new JTextField("Choose a Order to delete: ");
                    text1.setFont(new Font("Time new roman", Font.PLAIN, 20));
                    text1.setEditable(false);
                    text1.setBounds(10, 10, 300,45);
                    a1.add(text1);
                    for(int i = 0; i < myOrders.size(); i++){
                        JButton newButton1 = new JButton("Order[" + (i+1) + "]");
                        newButton1.setBounds(10,10 + 70*(i+1), 200,45);
                        int finalI = i;
                        newButton1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JPanel newpanel1 = new JPanel();
                                myOrders.remove(finalI);
                                JTextField textfield = new JTextField("Order[" + (finalI + 1) + "] was delete.");
                                textfield.setEditable(false);
                                textfield.setBounds(10,10,400,40);
                                textfield.setFont(new Font("Time new roman",Font.PLAIN, 24));
                                newpanel1.add(textfield);

                                JButton exittt = new JButton("Exit");
                                exittt.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        notification.setText("");
                                        cardLayout.show(jPanelRight,"nulll");
                                    }
                                });
                                exittt.setBounds(200,600,100,40);
                                newpanel1.add(exittt);
                                newpanel1.setLayout(null);
                                newpanel1.setSize(780,700);
                                jPanelRight.add("delete",newpanel1);
                                cardLayout.show(jPanelRight, "delete");
                            }
                        });
                        a1.add(newButton1);
                    }
                    jPanelRight.add("Deletee",a1);
                    cardLayout.show(jPanelRight, "Deletee");

                }
            }
        });
        panel.add(deleteOrder);

        JButton deleteButton = new JButton("Delete Items by id");
        deleteButton.setBounds(10,330,150,25);
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                notification.setText("Delete Items");
                if(myOrders.size() == 0){
                    JPanel a1 =new JPanel();
                    a1.setLayout(null);
                    a1.setVisible(true);
                    JTextField newtext = new JTextField("No Order was created");
                    newtext.setBounds(20,100,400,45);
                    newtext.setFont(new Font("Time new Roman", Font.PLAIN , 25));
                    newtext.setEditable(false);
                    JTextField advice = new JTextField("Please create a Order");
                    advice.setBounds(20,300,400,45);
                    advice.setFont(new Font("Time new Roman", Font.PLAIN, 25));
                    advice.setEditable(false);
                    a1.add(newtext);
                    a1.add(advice);
                    jPanelRight.add("abc1",a1);
                    cardLayout.show(jPanelRight, "abc1");
                } else {
                    JPanel a1 = new JPanel();
                    a1.setLayout(null);
                    a1.setVisible(true);
                    JTextField text1 = new JTextField("Choose a Order: ");
                    text1.setFont(new Font("Time new roman", Font.PLAIN, 20));
                    text1.setEditable(false);
                    text1.setBounds(10, 10, 200,45);
                    a1.add(text1);
                    for(int i = 0; i < myOrders.size(); i++){
                        JButton newButton1 = new JButton("Order[" + (i+1) + "]");
                        newButton1.setBounds(10,10 + 70*(i+1), 200,45);
                        int finalI = i;
                        newButton1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JPanel newpanel1 = new JPanel();
                                JTextField textfield = new JTextField("Delete item in Order[" + (finalI + 1) + "]");
                                textfield.setEditable(false);
                                textfield.setBounds(10,10,200,40);
                                textfield.setFont(new Font("Time new roman",Font.PLAIN, 20));
                                newpanel1.add(textfield);

                                JTextField delete = new JTextField("Enter the id: ");
                                delete.setBounds(10,210,150,40);
                                delete.setFont(new Font("Time new roman", Font.PLAIN, 18));
                                delete.setEditable(false);
                                newpanel1.add(delete);
                                JTextField idtext = new JTextField();
                                idtext.setBounds(160,210,200,40);
                                idtext.setFont(new Font("Time new roman", Font.PLAIN, 18));
                                newpanel1.add(idtext);

                                JButton exittt = new JButton("Oke");
                                exittt.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        notification.setText("A items was removed in Order[" + (finalI+1) + "]");
                                        JPanel a7 = new JPanel();
                                        a7.setLayout(null);
                                        myOrders.get(finalI).removeMedia(Integer.parseInt(idtext.getText()) - 1);
                                        JTextField noti = new JTextField("A items was removed in Order[" + (finalI+1) + "]");
                                        noti.setBounds(110,210,400,40);
                                        noti.setFont(new Font("Time new roman", Font.PLAIN, 25));
                                        a7.add(noti);
                                        jPanelRight.add("notice",a7);
                                        cardLayout.show(jPanelRight,"notice");
                                    }
                                });
                                exittt.setBounds(200,600,100,40);
                                newpanel1.add(exittt);
                                newpanel1.setLayout(null);
                                newpanel1.setSize(780,700);
                                jPanelRight.add("deletee",newpanel1);
                                cardLayout.show(jPanelRight, "deletee");
                            }
                        });
                        a1.add(newButton1);
                    }
                    jPanelRight.add("Deletee",a1);
                    cardLayout.show(jPanelRight, "Deletee");

                }
            }
        });
        panel.add(deleteButton);

        JButton getluckyButton = new JButton("Get a lucky item");
        getluckyButton.setBounds(10,450,150,25);
        getluckyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                notification.setText("Get a lucky item");
                if(myOrders.size() == 0){
                    JPanel a1 =new JPanel();
                    a1.setLayout(null);
                    a1.setVisible(true);
                    JTextField newtext = new JTextField("No Order was created");
                    newtext.setBounds(20,100,400,45);
                    newtext.setFont(new Font("Time new Roman", Font.PLAIN , 25));
                    newtext.setEditable(false);
                    JTextField advice = new JTextField("Please create a Order");
                    advice.setBounds(20,300,400,45);
                    advice.setFont(new Font("Time new Roman", Font.PLAIN, 25));
                    advice.setEditable(false);
                    a1.add(newtext);
                    a1.add(advice);
                    jPanelRight.add("abc5",a1);
                    cardLayout.show(jPanelRight, "abc5");
                } else {
                    JPanel a1 = new JPanel();
                    a1.setLayout(null);
                    a1.setVisible(true);
                    JTextField text1 = new JTextField("Choose a Order: ");
                    text1.setFont(new Font("Time new roman", Font.PLAIN, 20));
                    text1.setEditable(false);
                    text1.setBounds(10, 10, 200,45);
                    a1.add(text1);
                    for(int i = 0; i < myOrders.size(); i++){
                        JButton newButton1 = new JButton("Order[" + (i+1) + "]");
                        newButton1.setBounds(10,10 + 70*(i+1), 200,45);
                        int finalI = i;
                        newButton1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if(myOrders.get(finalI).getItemsOrdered().size() > 0) {
                                	Media luckyMedia = myOrders.get(finalI).getLuckyItem();
                                    JOptionPane.showMessageDialog(jPanelRight, "Lucky items is: " + luckyMedia.getTitle());
                                } else {
                                	JOptionPane.showMessageDialog(jPanelRight, "No items is in this order!", "Warning", JOptionPane.WARNING_MESSAGE);
                                }
                          
                            }
                        });
                        a1.add(newButton1);
                    }
                    jPanelRight.add("Deletee",a1);
                    cardLayout.show(jPanelRight, "Deletee");

                }
            }
        });
        panel.add(getluckyButton);
        
        JButton ExitButton = new JButton("Exit now");
        ExitButton.setBounds(10,520,150,25);
        ExitButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
        panel.add(ExitButton);
        
        panel.setLayout(null);
        panel.setVisible(true);
        panel.setSize(200,900);
        add(panel);

        jPanelRight.setBounds(203,0,789,900);
        jPanelRight.setLayout(cardLayout);
        jPanelRight.setVisible(true);
        JPanel nulll =  new JPanel();
        nulll.add(new Label("Option"));
        nulll.setLayout(null);
        nulll.setVisible(true);
        jPanelRight.add("nulll",nulll);
        cardLayout.show(jPanelRight,"nulll");
        add(jPanelRight);

        setSize(1000,700);
        setLayout(null);
    	setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
 
        SwingUtilities.invokeLater(new Runnable() {
 
            public void run() {
 
                Aims ex = new Aims();
                ex.setVisible(true);
            }
        });
    }
}
	
