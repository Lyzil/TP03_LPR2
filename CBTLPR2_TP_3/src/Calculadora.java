import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.*;
import java.awt.event.*;

public class Calculadora{
    private JTextField resultado = new JTextField("0");
    private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8,
                    btn9, igual, mais, menos, divisao, multi, ponto, limpar;
    private String valor1, valor2;
    public static void main(String[] args) {
        new Calculadora().criarForm();
    }
    public void criarForm(){
        JFrame form = new JFrame("Calculadora");
        form.setSize(200,200);
        form.setLocation(50,50);
        form.setLayout(new BorderLayout());
        	resultado.setHorizontalAlignment(SwingConstants.RIGHT);
//form.addWindowListener(new FechaJanela());
        
        JPanel painelSuperior = new JPanel();
        painelSuperior.setLayout(new GridLayout(1,1));
        painelSuperior.add(resultado);

        JPanel painelInferior = new JPanel();
        painelInferior.setLayout(new GridLayout(5,4));
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn0 = new JButton("0");
        igual = new JButton("=");
        mais = new JButton("+");
        menos = new JButton("-");
        divisao = new JButton("/");
        multi = new JButton("*");
        ponto = new JButton(".");
        limpar = new JButton("C"); 
/*
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn0.addActionListener(this);
        igual.addActionListener(this);
        mais.addActionListener(this);
        menos.addActionListener(this);
        divisao.addActionListener(this);
        multi.addActionListener(this);
        ponto.addActionListener(this);
        limpar.addActionListener(this);
        */
        painelInferior.add(btn7);
        painelInferior.add(btn8);
        painelInferior.add(btn9);
        painelInferior.add(divisao);
        painelInferior.add(btn4);
        painelInferior.add(btn5);
        painelInferior.add(btn6);
        painelInferior.add(multi);
        painelInferior.add(btn1);
        painelInferior.add(btn2);
        painelInferior.add(btn3);
        painelInferior.add(menos);
        painelInferior.add(btn0);
        painelInferior.add(ponto);
        painelInferior.add(igual);
        painelInferior.add(mais);
        painelInferior.add(limpar);
        
        form.add(painelSuperior, BorderLayout.CENTER);
        form.add(painelInferior, BorderLayout.SOUTH);
        form.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
    	for(int i = 1; i < 3; i++ ) 
    	{
	        if (e.getSource()==btn1)
	        {
	            
	        }
	        else if (e.getSource()==btn2)
	        {
	           
	        }
	        else if (e.getSource()==btn3)
	        {
	            
	        }
	        else if (e.getSource()==btn4)
	        {
	            
	        }
	        else if (e.getSource()==btn5)
	        {
	            
	        }
	        else if (e.getSource()==btn6)
	        {
	            
	        }
	        else if (e.getSource()==btn7)
	        {
	            
	        }
	        else if (e.getSource()==btn8)
	        {
	            
	        }
	        else if (e.getSource()==btn9)
	        {
	            
	        }
	        else if (e.getSource()==btn0)
	        {
	            
	        }
	        else if (e.getSource()==igual)
	        {
	        	try {
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(null, "Idade deve ser um numero inteiro.", "Erro", JOptionPane.ERROR_MESSAGE);
	            } catch (IllegalArgumentException ex) {
	                JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
	            } finally {
	            	
	            }
	        }
	        else if (e.getSource()==mais)
	        {
	        	try {
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(null, "Idade deve ser um numero inteiro.", "Erro", JOptionPane.ERROR_MESSAGE);
	            } catch (IllegalArgumentException ex) {
	                JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
	            }finally {
	            	
	            }
	        }
	        else if (e.getSource()==menos)
	        {
	        	try {
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(null, "Idade deve ser um numero inteiro.", "Erro", JOptionPane.ERROR_MESSAGE);
	            } catch (IllegalArgumentException ex) {
	                JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
	            } finally {
	            	
	            }
	        }
	        else if (e.getSource()==divisao)
	        {
	        	try {
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(null, "Idade deve ser um numero inteiro.", "Erro", JOptionPane.ERROR_MESSAGE);
	            } catch (IllegalArgumentException ex) {
	                JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
	            } finally {
	            	
	            }       
	        }
	        else if (e.getSource()==multi)
	        {
	        	try {
		        } catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(null, "Idade deve ser um numero inteiro.", "Erro", JOptionPane.ERROR_MESSAGE);
		        } catch (IllegalArgumentException ex) {
		            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		        } finally {
		        	
		        }
	        }
	        else if (e.getSource()==ponto)
	        {
	            System.exit(0);
	        }
	        else if (e.getSource()==limpar)
	        {
	            resultado.setText("0");
	        }
    	}
    }
}