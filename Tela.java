import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;


public class Tela extends JFrame implements ActionListener 
{
   private JTextField qtd;       //JTextField é um campo editavel pelo usuario.
   private JLabel lblqtd;        //JLabel é um campo que não é editavel pelo usuario.
   private JButton btnConsultar;    //JButton é um botão.
   private Connection conn;
   
    public void actionPerformed (ActionEvent e)
   {
      if(e.getSource() == btnConsultar)
      {
         String valor = Integer.parseInt(valor.getText());
         
      }
   }     

   
   public Tela(Connection conn)
   {
      super("Opcoes Disponiveis");
      
      this.conn = conn;
      
      JPanel painelSuperior = new JPanel (new GridLayout(1,1));
      JPanel painelEntrada = new JPanel (new FlowLayout());
      
      qtd = new JTextField(5);
      lblqtd = new JLabel("Quantidade de Temperatuas: "); 
      
      painelSuperior.add(lblqtd);
      painelSuperior.add(qtd);
      painelEntrada.add(painelSuperior);
      
      JPanel painelBotoes = new JPanel(new FlowLayout());
      btnConsultar = new JButton("Consultar");
      
      btnConsultar.addActionListener(this); //Botão observado pela tela
      
      painelBotoes.add(btnConsultar);
      
      Container painelDeConteudo = getContentPane();
      
      painelDeConteudo.setLayout(new BorderLayout());
      
      painelDeConteudo.add(painelEntrada, BorderLayout.CENTER);   //Posicionamento do painel
      painelDeConteudo.add(painelBotoes, BorderLayout.SOUTH);     //Posicionamento do painel
      
      setSize(300, 120);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Quando clicar no X ele fecha a aplicação
      setLocationRelativeTo(null);  //Centraliza a tela;
      setVisible(true); //Torna a tela visivel
      
   }      
}