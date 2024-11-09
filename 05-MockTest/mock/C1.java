public class C1{

    String name;
    int age;
    
        public C1(String name, int age){
            this.name = name;
            this.age = age;
        }
    
    
        public String getName() {
            return name;
        }
    
        public int getAge() {
            return age;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public void setAge(int age) {
            this.age = age;
        }
    
        public boolean isAdult(){
            boolean answer = false;
            if(this.age >= 18){
                answer = true;
            }
            return answer;
        }
    
        public String displayPerson(){
            return this.name+","+this.age;
        }
    }