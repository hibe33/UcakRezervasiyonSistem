/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hussein
 */
class User {
    String idFlight_Schedule,Company_name,From,To,Departure_Time,Arrival_Time,Departure_Date,Arrival_Date,Price;
    
    public User(String idFlight_Schedule,String Company_name,String From,String To,String Departure_Time,String Arrival_Time,String Departure_Date,String Arrival_Date,String Price){
        this.idFlight_Schedule=idFlight_Schedule;
        this.Company_name=Company_name;
        this.From=From;
        this.To=To;
        this.Departure_Time=Departure_Time;
        this.Arrival_Time=Arrival_Time;
        this.Departure_Date=Departure_Date;
        this.Arrival_Date=Arrival_Date;
        this.Price=Price;
    }

        public String getidFlight_Schedule(){
        return idFlight_Schedule;
        }
        public String getCompany_name(){
        return Company_name;
        }
        public String getFrom(){
        return From;
        }
        public String getTo(){
        return To;
        }
        public String getDeparture_Time(){
        return Departure_Time;
        }
        public String getArrival_Time(){
        return Arrival_Time;
        }
        public String getDeparture_Date(){
        return Departure_Date;
        }
         public String getPrice(){
        return Price;
        }
    }
    
