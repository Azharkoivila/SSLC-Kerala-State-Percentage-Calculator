import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

class Main extends JFrame implements ItemListener,ActionListener{
	private static final long serialVersionUID = 1L;
	int Sub1G,Sub2G,Sub3G,Sub4G,Sub5G,Sub6G,Sub7G,Sub8G,Sub9G,Sub10G;
	float totel,percentage;
	int aplus,a,bplus,b,cplus,c,dplus;
	static JMenuBar mb;
	static JMenu Help;
	static JMenuItem about;
	static JFrame jf,helpFrame;
	static JPanel jp;
	static JButton jb;
	static JLabel display;
	static JLabel nonDisplay,aboutlabel;
	static JLabel jlFristLanguage;
	static JLabel jlSecondLanguage;
	static JLabel jlEngilsh;
	static JLabel jlHindi;
	static JLabel jlSocialScience;
	static JLabel jlPhysics;
	static JLabel jlChemistry;
	static JLabel jlBiology;
	static JLabel jlMathematics;
	static JLabel jlIt;
	static String[] choices = { "Choose","A+","A", "B+","B","C+","C","D+"};
	static JComboBox<String> cbFristLanguage,cbSecondLanguage,cbEnglish,cbHindi;
	static JComboBox<String>cbSocialScience, cbPhysics,cbChemistry,cbBiology,cbMathematics,cbIt;
	boolean choose=true;
	public static void main(String args[]) throws IOException, URISyntaxException {
		
		jf=new JFrame("SSLC Percentage Calculator (Kerala)");
		jf.setLayout(null);
		jf.setSize(400,700);
		jf.setLocation(600,200);
		jf.setResizable(false);
		jf.getContentPane().setBackground(new Color(27,37,47,255));
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		helpFrame=new JFrame("About Me");
		helpFrame.setLayout(null);
		helpFrame.setSize(250,250);
		helpFrame.setLocation(680,400);
		helpFrame.setResizable(false);
		helpFrame.getContentPane().setBackground(new Color(27,37,47,255));
		
		aboutlabel=new JLabel("Designed & Developed by");
		aboutlabel.setBounds(0,10,200,20);
		aboutlabel.setBackground(Color.blue);
		aboutlabel.setForeground(Color.white);
		aboutlabel.setFont(new Font("Arial",Font.ITALIC,17));
		aboutlabel.setVisible(true);
		helpFrame.add(aboutlabel);
		
		JLabel azharkoivila=new JLabel("Azharkoivila");
		azharkoivila.setBounds(70,70,200,40);
		azharkoivila.setForeground(Color.GREEN);
		azharkoivila.setFont(new Font("Arial",Font.ITALIC,20));
		azharkoivila.setVisible(true);
		helpFrame.add(azharkoivila);
		
		final URI uri = new URI("http://azharkoivila.gitlab.io");
		JButton button = new JButton();
		button.setBounds(30,150,200,20);
		button.setForeground(Color.BLUE);
		button.setFont(new Font("Arial",Font.PLAIN,18));
		button.setText("Contact Me");
		button.setBorderPainted(false);
		button.setOpaque(false);
		button.setBackground(Color.BLUE);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Desktop.isDesktopSupported()) {
					Desktop desktop = Desktop.getDesktop();
					 {
						try {
							desktop.browse(uri);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
					}
				
				
			}
		});
		button.setVisible(true);
		helpFrame.add(button);
		
		Main n=new Main();
		
		mb = new JMenuBar();
		Help = new JMenu("Help");
		about = new JMenuItem("About");
		mb.setBackground(new Color(33,47,60,255));
		Help.setForeground(Color.white);
		mb.setOpaque(true);
		Help.add(about);
		mb.add(Help);
		jf.setJMenuBar(mb);
		about.addActionListener(n);
		
		cbFristLanguage = new JComboBox<>(choices);		
		cbFristLanguage.setBounds(295,25,90,30);
		cbFristLanguage.setVisible(true);
		jf.add(cbFristLanguage);
		cbFristLanguage.addItemListener(n);
		
		cbSecondLanguage = new JComboBox<>(choices);
		cbSecondLanguage.setBounds(295,75,90,30);
		cbSecondLanguage.setVisible(true);
		jf.add(cbSecondLanguage);
		cbSecondLanguage.addItemListener(n);
		
		cbEnglish=new JComboBox<>(choices);
		cbEnglish.setBounds(295,125,90,30);
		cbEnglish.setVisible(true);
		jf.add(cbEnglish);
		cbEnglish.addItemListener(n);
		
		
		cbHindi=new JComboBox<>(choices);
		cbHindi.setBounds(295,175,90,30);
		cbHindi.setVisible(true);
		jf.add(cbHindi);
		cbHindi.addItemListener(n);
		
		cbSocialScience=new JComboBox<>(choices);
		cbSocialScience.setBounds(295,225,90,30);
		cbSocialScience.setVisible(true);
		jf.add(cbSocialScience);
		cbSocialScience.addItemListener(n);
		
		cbPhysics=new JComboBox<>(choices);
		cbPhysics.setBounds(295,280,90,30);
		cbPhysics.setVisible(true);
		jf.add(cbPhysics);
		cbPhysics.addItemListener(n);
		
		cbChemistry=new JComboBox<>(choices);
		cbChemistry.setBounds(295,330,90,30);
		cbChemistry.setVisible(true);
		jf.add(cbChemistry);
		cbChemistry.addItemListener(n);
		
		cbBiology=new JComboBox<>(choices);
		cbBiology.setBounds(295,380,90,30);
		cbBiology.setVisible(true);
		jf.add(cbBiology);
		cbBiology.addItemListener(n);
		
		cbMathematics=new JComboBox<>(choices);
		cbMathematics.setBounds(295,430,90,30);
		cbMathematics.setVisible(true);
		jf.add(cbMathematics);
		cbMathematics.addItemListener(n);
		
		cbIt=new JComboBox<>(choices);
		cbIt.setBounds(295,480,90,30);
		cbIt.setVisible(true);
		jf.add(cbIt);
		cbIt.addItemListener(n);
		
		

		jlFristLanguage=new JLabel("Frist Language");
		jlFristLanguage.setBounds(10,20,380,40);
		jlFristLanguage.setFont(new Font("Arial",Font.PLAIN,25));
		jlFristLanguage.setBackground(new Color(33,47,60,255));
		jlFristLanguage.setOpaque(true);
		jlFristLanguage.setForeground(Color.white);
		jlFristLanguage.setVisible(true);
		jf.add(jlFristLanguage);
		
		jlSecondLanguage=new JLabel("Second Language");
		jlSecondLanguage.setBounds(10,70,380,40);
		jlSecondLanguage.setFont(new Font("Arial",Font.PLAIN,25));
		jlSecondLanguage.setBackground(new Color(33,47,60,255));
		jlSecondLanguage.setOpaque(true);
		jlSecondLanguage.setForeground((Color.white));
		jlSecondLanguage.setVisible(true);
		jf.add(jlSecondLanguage);
		
		jlEngilsh=new JLabel("English");
		jlEngilsh.setBounds(10,120,380,40);
		jlEngilsh.setFont(new Font("Arial",Font.PLAIN,25));
		jlEngilsh.setBackground(new Color(33,47,60,255));
		jlEngilsh.setForeground(Color.white);
		jlEngilsh.setOpaque(true);
		jlEngilsh.setVisible(true);
		jf.add(jlEngilsh);
		
		jlHindi=new JLabel("Hindi");
		jlHindi.setBounds(10,170,380,40);
		jlHindi.setFont(new Font("Arial",Font.PLAIN,25));
		jlHindi.setBackground(new Color(33,47,60,255));
		jlHindi.setForeground(Color.white);
		jlHindi.setOpaque(true);
		jlHindi.setVisible(true);
		jf.add(jlHindi);
		
		jlSocialScience=new JLabel("Social Science");
		jlSocialScience.setBounds(10,220,380,40);
		jlSocialScience.setFont(new Font("Arial",Font.PLAIN,25));
		jlSocialScience.setBackground(new Color(33,47,60,255));
		jlSocialScience.setOpaque(true);
		jlSocialScience.setForeground(Color.white);
		jlSocialScience.setVisible(true);
		jf.add(jlSocialScience);
		
		jlPhysics=new JLabel("Physics");
		jlPhysics.setBounds(10,275,380,40);
		jlPhysics.setFont(new Font("Arial",Font.PLAIN,25));
		jlPhysics.setBackground(new Color(33,47,60,255));
		jlPhysics.setForeground(Color.white);
		jlPhysics.setOpaque(true);
		jlPhysics.setVisible(true);
		jf.add(jlPhysics);
		
		jlChemistry=new JLabel("Chemistry");
		jlChemistry.setBounds(10,325,380,40);
		jlChemistry.setFont(new Font("Arial",Font.PLAIN,25));
		jlChemistry.setBackground(new Color(33,47,60,255));
		jlChemistry.setForeground(Color.WHITE);
		jlChemistry.setOpaque(true);
		jlChemistry.setVisible(true);
		jf.add(jlChemistry);
		
		jlBiology=new JLabel("Biology");
		jlBiology.setBounds(10,375,380,40);
		jlBiology.setFont(new Font("Arial",Font.PLAIN,25));
		jlBiology.setBackground(new Color(33,47,60,255));
		jlBiology.setOpaque(true);
		jlBiology.setForeground(Color.white);
		jlBiology.setVisible(true);
		jf.add(jlBiology);
		
		jlMathematics=new JLabel("Mathematics");
		jlMathematics.setBounds(10,425,380,40);
		jlMathematics.setFont(new Font("Arial",Font.PLAIN,25));
		jlMathematics.setBackground(new Color(33,47,60,255));
		jlMathematics.setOpaque(true);
		jlMathematics.setForeground(Color.white);
		jlMathematics.setVisible(true);
		jf.add(jlMathematics);
		
		jlIt=new JLabel("IT");
		jlIt.setBounds(10,475,380,40);
		jlIt.setFont(new Font("Arial",Font.PLAIN,25));
		jlIt.setBackground(new Color(33,47,60,255));
		jlIt.setOpaque(true);
		jlIt.setForeground(Color.white);
		jlIt.setVisible(true);
		jf.add(jlIt);
		
		
		display=new JLabel();
		display.setBounds(10,530,380,50);
		display.setFont(new Font("Arial",Font.PLAIN,20));
		display.setForeground(Color.green);
		display.setVisible(true);
		jf.add(display);
		
		nonDisplay=new JLabel();
		
		jb=new JButton("Calculate");
		jb.setBounds(130,590,150,50);
		jb.setFont(new Font("Arial",Font.PLAIN,20));
		jb.setBackground(new Color(7,95,254,255));
		jb.setForeground(Color.white);
		jb.setContentAreaFilled(true);
		jb.setFocusPainted(true);
		jb.setBorderPainted(true);
		jb.setVisible(true);
		jb.addActionListener(n);
		jf.add(jb);
		
		jf.setVisible(true);
	}
	

	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==cbFristLanguage) {
			nonDisplay.setText((String) cbFristLanguage.getSelectedItem());
			choose=false;
			if (nonDisplay.getText()=="A+") {
				aplus=9;
				Sub1G=aplus;
				
			}
			if (nonDisplay.getText()=="A") {
				a=8;
				Sub1G=a;
				
			}
			if(nonDisplay.getText()=="B+") {
				bplus=7;
				Sub1G=bplus;
			}
			if(nonDisplay.getText()=="B") {
				b=6;
				Sub1G=b;
			}
			if(nonDisplay.getText()=="C+") {
				cplus=5;
				Sub1G=cplus;
			}
			if(nonDisplay.getText()=="C") {
				c=4;
				Sub1G=c;
			}
			if(nonDisplay.getText()=="D+") {
				dplus=3;
				Sub1G=dplus;
			}
		}
		choose=true;
		if(e.getSource()==cbSecondLanguage) {
			nonDisplay.setText((String)cbSecondLanguage.getSelectedItem());
			choose=false;
			if(nonDisplay.getText()=="A+") {
				aplus=9;
				Sub2G=aplus;
			}
			if(nonDisplay.getText()=="A") {
				a=8;
				Sub2G=a;
			}
			if(nonDisplay.getText()=="B+") {
				bplus=7;
				Sub2G=bplus;
			}
			if(nonDisplay.getText()=="B") {
				b=6;
				Sub2G=b;
			}
			if(nonDisplay.getText()=="C+") {
				cplus=5;
				Sub2G=cplus;
			}
			if(nonDisplay.getText()=="C") {
				c=4;
				Sub2G=c;
			}
			if(nonDisplay.getText()=="D+") {
				dplus=3;
				Sub2G=dplus;
			}
		}
		choose=true;
		if(e.getSource()==cbEnglish) {
			nonDisplay.setText((String)cbEnglish.getSelectedItem());
			choose=false;
			if (nonDisplay.getText()=="A+") {
				aplus=9;
				Sub3G=aplus;
			}
			if(nonDisplay.getText()=="A") {
				a=8;
				Sub3G=a;
			}
			if(nonDisplay.getText()=="B+") {
				bplus=7;
				Sub3G=bplus;
			}
			if(nonDisplay.getText()=="B") {
				b=6;
				Sub3G=b;
			}
			if(nonDisplay.getText()=="C+") {
				cplus=5;
				Sub3G=cplus;
			}
			if(nonDisplay.getText()=="C") {
				c=4;
				Sub3G=c;
			}
			if(nonDisplay.getText()=="D+") {
				dplus=3;
				Sub3G=dplus;
			}
			
		}
		choose=true;
		if(e.getSource()==cbHindi) {
			nonDisplay.setText((String) cbHindi.getSelectedItem());
			choose=false;
			if(nonDisplay.getText()=="A+") {
				aplus=9;
				Sub4G=aplus;
			}
			if(nonDisplay.getText()=="A") {
				a=8;
				Sub4G=a;
			}
			if(nonDisplay.getText()=="B+") {
				bplus=7;
				Sub4G=bplus;
			}
			if(nonDisplay.getText()=="B") {
				b=6;
				Sub4G=b;
			}
			if(nonDisplay.getText()=="C+") {
				cplus=5;
				Sub4G=cplus;
			}
			if(nonDisplay.getText()=="C") {
				c=4;
				Sub4G=c;
			}
			if(nonDisplay.getText()=="D+") {
				dplus=3;
				Sub4G=dplus;
			}
		}
		choose=true;
			if(e.getSource()==cbSocialScience) {
				nonDisplay.setText((String) cbSocialScience.getSelectedItem());
				choose=false;
				if(nonDisplay.getText()=="A+") {
					aplus=9;
					Sub5G=aplus;
				}
				if(nonDisplay.getText()=="A") {
					a=8;
					Sub5G=a;
				}
				if(nonDisplay.getText()=="B+") {
					bplus=7;
					Sub5G=bplus;
				}
				if(nonDisplay.getText()=="B") {
					b=6;
					Sub5G=b;
				}
				if(nonDisplay.getText()=="C+") {
					cplus=5;
					Sub5G=cplus;
				}
				if(nonDisplay.getText()=="C") {
					c=4;
					Sub5G=c;
				}
				if(nonDisplay.getText()=="D+") {
					dplus=3;
					Sub5G=dplus;
				}
			}
			choose=true;
			if(e.getSource()==cbPhysics) {
				nonDisplay.setText((String)cbPhysics.getSelectedItem());
				choose=false;
				if(nonDisplay.getText()=="A+") {
					aplus=9;
					Sub6G=aplus;
				}
				if(nonDisplay.getText()=="A") {
					a=8;
					Sub6G=a;
				}
				if(nonDisplay.getText()=="B+") {
					bplus=7;
					Sub6G=bplus;
				}
				if(nonDisplay.getText()=="B") {
					b=6;
					Sub6G=b;
				}
				if(nonDisplay.getText()=="C+") {
					cplus=5;
					Sub6G=cplus;
				}
				if(nonDisplay.getText()=="C") {
					c=4;
					Sub6G=c;
				}
				if(nonDisplay.getText()=="D+") {
					dplus=3;
					Sub6G=dplus;
				}
			}
			choose=true;
			if(e.getSource()==cbChemistry) {
				nonDisplay.setText((String)cbChemistry.getSelectedItem());
				choose=false;
				if(nonDisplay.getText()=="A+") {
					aplus=9;
					Sub7G=aplus;
				}
				if(nonDisplay.getText()=="A") {
					a=8;
					Sub7G=a;
				}
				if(nonDisplay.getText()=="B+") {
					bplus=7;
					Sub7G=bplus;
				}
				if(nonDisplay.getText()=="B") {
					b=6;
					Sub7G=b;
				}
				if(nonDisplay.getText()=="C+") {
					cplus=5;
					Sub7G=cplus;
				}
				if(nonDisplay.getText()=="C") {
					c=4;
					Sub7G=c;
				}
				if(nonDisplay.getText()=="D+") {
					dplus=3;
					Sub7G=dplus;
				}
			}
			choose=true;
			if(e.getSource()==cbBiology) {
				nonDisplay.setText((String)cbBiology.getSelectedItem());
				choose=false;
				if(nonDisplay.getText()=="A+") {
					aplus=9;
					Sub8G=aplus;
				}
				if(nonDisplay.getText()=="A") {
					a=8;
					Sub8G=a;
				}
				if(nonDisplay.getText()=="B+") {
					bplus=7;
					Sub8G=bplus;
				}
				if(nonDisplay.getText()=="B") {
					b=6;
					Sub8G=b;
				}
				if(nonDisplay.getText()=="C+") {
					cplus=5;
					Sub8G=cplus;
				}
				if(nonDisplay.getText()=="C") {
					c=4;
					Sub8G=c;
				}if(nonDisplay.getText()=="D+") {
					dplus=3;
					Sub8G=dplus;
				}
			}
			choose=true;
			if(e.getSource()==cbMathematics) {
				nonDisplay.setText((String)cbMathematics.getSelectedItem());
				choose=false;
				if(nonDisplay.getText()=="A+") {
					aplus=9;
					Sub9G=aplus;
				}
				if(nonDisplay.getText()=="A") {
					a=8;
					Sub9G=a;
				}
				if(nonDisplay.getText()=="B+") {
					bplus=7;
					Sub9G=bplus;
				}
				if(nonDisplay.getText()=="B") {
					b=6;
					Sub9G=b;
				}
				if(nonDisplay.getText()=="C+") {
					cplus=5;
					Sub9G=cplus;
				}
				if(nonDisplay.getText()=="C") {
					c=4;
					Sub9G=c;
				}
				if(nonDisplay.getText()=="D+") {
					dplus=3;
					Sub9G=dplus;
				}
			}
			choose=true;
			if(e.getSource()==cbIt) {
				nonDisplay.setText((String)cbIt.getSelectedItem());
				choose=false;
				if(nonDisplay.getText()=="A+") {
					aplus=9;
					Sub10G=aplus;
				}
				if(nonDisplay.getText()=="A") {
					a=8;
					Sub10G=a;
				}
				if(nonDisplay.getText()=="B+") {
					bplus=7;
					Sub10G=bplus;
				}
				if(nonDisplay.getText()=="B") {
					b=6;
					Sub10G=b;
				}
				if(nonDisplay.getText()=="C+") {
					cplus=5;
					Sub10G=cplus;
				}
				if(nonDisplay.getText()=="C") {
					c=4;
					Sub10G=c;
				}
				if(nonDisplay.getText()=="D+") {
					dplus=3;
					Sub10G=dplus;
				}
			}	
		}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jb) {
			if(choose==true) {
				display.setText("Choose all Subject Grade!!!");
			}else {
			totel=Sub1G+Sub2G+Sub3G+Sub4G+Sub5G+Sub6G+Sub7G+Sub8G+Sub9G+Sub10G;
			percentage=(float) (totel*1.11);
			display.setText("Congratulation YOU HAVE "+percentage+" %");
			}
		}
		if(e.getSource()==about) {
			helpFrame.setVisible(true);
		}
	}
	
}
