/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ulviyehacizade
 */
class User 
{
    private int uid;
    private String name, address, gender, course, subject;
    
    public User(int uid, String name, String address, String gender, String course, String subject)
    {
        this.uid = uid;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.course = course;
        this.subject = subject;   
    }
    public int getuid()
    {
        return uid;
    }
    public String getname()
    {
        return name;
    }
    public String getaddress()
    {
        return address;
    }
    public String getgender()
    {
        return gender;
    }
    public String getcourse()
    {
        return course;
    }
    public String getsubject()
    {
        return subject;
    }
}
