package com.anoojpai;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.net.*;


public class Bot extends JFrame {

    //Typing Area:
    private JTextField txtEnter = new JTextField();

    //Chat Area:
    private JTextArea txtChat = new JTextArea();

    public Bot() throws IOException, URISyntaxException {
        //Frame Attributes:
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("Vineyard Vines Chatbot");

        //txtEnter Attributes:
        txtEnter.setForeground(Color.WHITE);
        txtEnter.setBackground(Color.decode("0xF498AD"));
        txtEnter.setLocation(0, 535);
        txtEnter.setSize(this.getWidth(), 40);

        //txtEnter Action Event:
        txtEnter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                String uText = txtEnter.getText();

                txtChat.append("You: " + uText + "\n");

                if(uText.equals("help")){
                    txtChat.setText("");
                    botSay("Type any of these commands: " + "\n" +
                            "~Where is my order?" + "\n" +
                            "~I have a return order" + "\n" +
                            "~What are the sizes for clothing?" + "\n" +
                            "~Where do I enter my gift card?" + "\n" +
                            "~How can I contact you guys?" + "\n" +
                            "~How do I monogram clothes?" + "\n" +
                            "~Custom and Corporate gifts" + "\n" +
                            "~Do you guys have any discounts for students?" + "\n" +
                            "~Do you guys have any discounts for military?" + "\n" +
                            "~Find a store" + "\n" +
                            "~FAQ's" + "\n" +
                            "~Do you ship internationally?" + "\n" +
                            "~Are there any open jobs?");
                }
                else if(uText.equals("where is my order")){
                    botSay("Its on its way! but here is the tracking page");
                    final Desktop v = Desktop.getDesktop();
                    try {
                            v.browse(new URI("https://www.vineyardvines.com/checkorderstatus"));
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (URISyntaxException e) {
                            e.printStackTrace();
                        }
                }
                else if(uText.equals("I have a return order")){
                    botSay("Im sorry to hear that");
                        final Desktop w = Desktop.getDesktop();
                        try {
                            w.browse(new URI("https://www.vineyardvines.com/on/demandware.store/Sites-Vineyard-Vines-Site/default/OrderLocator-LoadOrderLocator"));
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (URISyntaxException e) {
                            e.printStackTrace();
                        }
                    }

                else if(uText.equals("How can I contact you guys")){
                    botSay("Anything you need is on our contact page");
                    final Desktop w = Desktop.getDesktop();
                    try {
                        w.browse(new URI("https://www.vineyardvines.com/contact"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
                }
                else if(uText.equals("What are the sizes for clothing")){
                    botSay("Im sorry to hear that");
                    final Desktop w = Desktop.getDesktop();
                    try {
                        w.browse(new URI("https://www.vineyardvines.com/sizechart"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
                }
                else if(uText.equals("Where do I enter my gift card")){
                    botSay("Your a lucky man or woman its 2018 we don't judge");
                    final Desktop w = Desktop.getDesktop();
                    try {
                        w.browse(new URI("https://www.vineyardvines.com/giftcards"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
                }
                else if(uText.equals("How do I monogram clothes")){
                    botSay("Good choice, making it your own is always better");
                    final Desktop w = Desktop.getDesktop();
                    try {
                        w.browse(new URI("https://www.vineyardvines.com/monogramming/monogramming.html"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
                }
                else if(uText.equals("Custom and Corporate gifts")){
                    botSay("Got an event? Well this page is for you then");
                    final Desktop w = Desktop.getDesktop();
                    try {
                        w.browse(new URI("https://www.vineyardvines.com/custom-corporate-gifts/custom-corporate-gifts.html"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
                }
                else if(uText.equals("Do you guys have any discounts for students")){
                    botSay("Of course we do we love our buds in school");
                    final Desktop w = Desktop.getDesktop();
                    try {
                        w.browse(new URI("https://www.vineyardvines.com/student-discount/student-discount.html"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
                }
                else if(uText.equals("Do you guys have any discounts for military")){
                    botSay("Yes we do! Thank you for serving our country!");
                    final Desktop w = Desktop.getDesktop();
                    try {
                        w.browse(new URI("https://www.vineyardvines.com/military-discount/military-discount.html"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
                }
                else if(uText.equals("Find a store")){
                    botSay("Smart choice, here are all of our stores in the U.S");
                    final Desktop w = Desktop.getDesktop();
                    try {
                        w.browse(new URI("https://www.vineyardvines.com/stores"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
                }
                else if(uText.equals("FAQ's")){
                    botSay("All your questions can be answered on this page");
                    final Desktop w = Desktop.getDesktop();
                    try {
                        w.browse(new URI("https://www.vineyardvines.com/frequently-asked-questions/frequently-asked-questions.html"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
                }
                else if(uText.equals("Do you ship internationally?")){
                    botSay("Yes we do! Here is the global website");
                    final Desktop v = Desktop.getDesktop();
                    try {
                        v.browse(new URI("https://global.vineyardvines.com/"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
                }
                else if(uText.equals("Are there any open jobs?")){
                    botSay("Here is the open jobs page!");
                    final Desktop v = Desktop.getDesktop();
                    try {
                        v.browse(new URI("https://www.vineyardvines.com/job-opportunities/job-opportunities.html"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
                }
                else if(uText.equals("clear")){
                    txtChat.setText("");
                }
                    else{
                        botSay("I didn't get that, type help for all the commands");
                }
                txtEnter.setText("");
            }
        });

        //txtChat Attributes:
        txtChat.setForeground(Color.WHITE);
        txtChat.setBackground(Color.decode("0x072C56"));
        txtChat.setLocation(0, 0);
        txtChat.setSize(this.getWidth(), this.getHeight());
        txtChat.setEditable(false);

        //Add Items To Frame:
        botSay("Welcome to Vineyards Vines, what can I help you with today? " + "\n" + "type help for all the commands");
        this.add(txtEnter);
        this.add(txtChat);

    }

    public void botSay(String s){
        txtChat.append("Vineyard Vines: " + s + "\n");
    }

    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
        new Bot();
    }

}