package inheritance;

public class Planner {
    String plannerName;
    String [][] dateEvents;
    int index;
    int size;

    Planner (){
        this.plannerName = "Default";
        this.dateEvents =new String[10][2];
        this.index=0;
        this.size=10;
        for (int i=0; i<this.dateEvents.length; i++){
            this.dateEvents[i][0]="Available";
            this.dateEvents[i][1]=" Available";
        }
    }
    Planner (String plannerName, int size){
        this.plannerName=plannerName;
        this.dateEvents=new String [size][2];
        this.size=size;
        this.index=0;
        for (int i=0; i<this.dateEvents.length; i++){
            this.dateEvents[i][0]=" ";
            this.dateEvents[i][1]=" ";
        }
    }

  private void displayPlanner (){
        System.out.println("--date--\t\t--Event--");
        for (String []events:this.dateEvents){
            System.out.println(events[0]+"\t\t"+events[1]);


        }
    }

      void addEvent (String date, String event){
        if (this.index<this.size){
            this.dateEvents[this.index][0]=date;
            this.dateEvents[this.index][1]=event;
            this.index++;
        }
        else {
            System.out.println("Planner is full");
        }
        displayPlanner();
    }
      void deleteEvent (String date){
          for (int i = 0; i <this.dateEvents.length; i++) {
                  if (this.dateEvents[i][0].equalsIgnoreCase(date) ){
                     this.dateEvents [i][0]=" ";
                      this.dateEvents[i][1]=" ";
                  }
              }
          displayPlanner();
        }
    }

