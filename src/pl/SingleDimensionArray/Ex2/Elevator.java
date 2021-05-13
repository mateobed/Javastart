package pl.SingleDimensionArray.Ex2;

public class Elevator {
    private Person [] people = new Person[4];
    private int peopleNumber = 0;
    private final int maxWeight = 400;

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    public int getPeopleNumber() {
        return peopleNumber;
    }

    public void  setPeopleNumber(int peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    void add(Person person){
        if(peopleNumber < 4){
            people[peopleNumber] = person;
            peopleNumber++;
        } else{
            System.out.println("W windzie nie ma już miejsca, proszę poczekać");
        }
    }

    public void out(int outNumberPerson){
        System.out.println("Wysiada " + outNumberPerson + " osób");
        setPeopleNumber(getPeopleNumber()-outNumberPerson);
    }

    void start(){
        if(weightIsCorrect()){
            System.out.println("Winda wystarowała");
        } else {
            int overload = getTotalWeight() - maxWeight;
            System.out.println("Winda jest przeciążona o " + overload + "kg");
        }

    }

    private boolean weightIsCorrect(){
        return getTotalWeight() <= maxWeight;
    }

    private int getTotalWeight(){
        int totalWeight = 0;
        if(people[0] != null)
            totalWeight += people[0].getWeight();
        if(people[1] != null)
            totalWeight += people[1].getWeight();
        if(people[2] != null)
            totalWeight += people[2].getWeight();
        if(people[3] != null)
            totalWeight += people[3].getWeight();
        return totalWeight;
    }

    void clear(){
        people[0] = null;
        people[1] = null;
        people[2] = null;
        people[3] = null;

        // lub people = new Person[4];

        peopleNumber = 0;
        System.out.println("Winda jest pusta");

    }

    public void elevatorOccupancy(){
        System.out.println("W windzie jedzie " + peopleNumber + " sztuk");
    }

}
