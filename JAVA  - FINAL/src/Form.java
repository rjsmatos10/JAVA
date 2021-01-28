// LEANDRO PEREIRA DOS SANTOS CB3005372
// RENAN JOSUÉ SILVA DE MATOS CB3007162

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.lang.Object;
import com.google.gson.Gson;

public class Form implements ActionListener {
			
	private JFrame frame = new JFrame();	
	private JPanel p = new JPanel();	
	private JPanel panelPrinc = new JPanel();

	private JButton buttonIncluir = new JButton();	
	private JButton buttonLimpar = new JButton();
	private JButton buttonShow = new JButton();
	private JButton buttonSair = new JButton();
	  
	private JLabel labelNome = new JLabel("Nome:");
	private JTextField JtNome = new JTextField(12);
	
	private JLabel labelIdade = new JLabel("Idade:");
	private JTextField JtIdade = new JTextField(12);
	
	private JLabel labelPeso = new JLabel("Peso:");
	private JTextField JtPeso = new JTextField(12);
	
	private JLabel labelAltura = new JLabel("Altura:");
	private JTextField JtAltura = new JTextField(12);
	
	private JLabel labelObjetivo = new JLabel("Objetivo:");
	private JTextField JtObjetivo = new JTextField(12);
	
    Form(){
    	
	    frame.setSize(520,310);
	    frame.setLocation(200,200);
	    frame.setTitle("TP - FINAL");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	  
	    panelPrinc.add(labelNome);
	    panelPrinc.add(JtNome);
	    panelPrinc.add(labelIdade);
	    panelPrinc.add(JtIdade);
	    panelPrinc.add(labelPeso);
	    panelPrinc.add(JtPeso);
	    panelPrinc.add(labelAltura);
	    panelPrinc.add(JtAltura);
	    panelPrinc.add(labelObjetivo);
	    panelPrinc.add(JtObjetivo);
	    panelPrinc.add(buttonIncluir);
	    panelPrinc.add(buttonLimpar);
	    panelPrinc.add(buttonShow);
	    panelPrinc.add(buttonSair);    
	    panelPrinc.setLayout(new GridLayout(9,0)); 
	    
		buttonIncluir.setText("Incluir");
		buttonIncluir.addActionListener(this);

		buttonLimpar.setText("Limpar");
		buttonLimpar.addActionListener(this);

		buttonShow.setText("Apresentar Dados");
		buttonShow.addActionListener(this);

        buttonSair.setText("Sair");      
        buttonSair.addActionListener(this);
	    	    
	    p.add(panelPrinc);
	    	    
	    frame.add(p);
	    frame.setVisible(true);
    
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		Aluno alunos = new Aluno();
		AlunoDAO dao = new AlunoDAO();

		String act = e.getActionCommand();
		
			
		if("Incluir".equals(act)){
			alunos.setName(JtNome.getText());
			alunos.setAge(Integer.parseInt(JtIdade.getText()));
			alunos.setWeight(Double.parseDouble(JtPeso.getText()));
			alunos.setHeight(Double.parseDouble(JtAltura.getText()));
			alunos.setGoal(JtObjetivo.getText());
			
			dao.insert(alunos);
			JOptionPane.showMessageDialog(null, "O aluno " + JtNome.getText() + " foi cadastrado!");
		}
		else if("Limpar".equals(act)) {
			JtIdade.setText("");
			JtAltura.setText("");
			JtObjetivo.setText("");
			JtNome.setText("");
			JtPeso.setText("");			

		}
		else if("Apresentar Dados".equals(act)) {
			Gson json=new Gson() ;
			alunos.setName(JtNome.getText());
			alunos.setAge(Integer.parseInt(JtIdade.getText()));
			alunos.setWeight(Double.parseDouble(JtPeso.getText()));
			alunos.setHeight(Double.parseDouble(JtAltura.getText()));
			alunos.setGoal(JtObjetivo.getText());
			String response = json.toJson(alunos);
			JOptionPane.showMessageDialog(null, response);
			
		}
		else if("Sair".equals(act)) {
			System.exit(0);
		}

		
	}
	

    public static void main(String[] args) {
	    
        
    Form formulario = new Form();
    
    
    }
}



