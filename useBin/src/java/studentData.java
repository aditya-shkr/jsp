/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aditya
 */
package bean;
public class studentData {
    private String name=null;
    private String email=null;
    private int age=0;
    
    public void setName(String name)
    {
        this.name=name;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public int getAge()
    {
        return age;
    }
}
