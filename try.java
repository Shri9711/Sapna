  try{
            Class.forName("com.mysql.jdbc.driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login_form","root","");
            String sql="select * frpm Login_table where username=? and password=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, username.getText());
            pst.setString(2, password.getText());
              ResultSet rs=pst.executeQuery();
              if(rs.next()){
               JOptionPane.showMessageDialog(null,"username and Password match");   
              }
              else{
                  JOptionPane.showMessageDialog(null,"username and Password doesnt match");
                  username.setText("");
                  password.setText("");
              }
            con.close();
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
      
