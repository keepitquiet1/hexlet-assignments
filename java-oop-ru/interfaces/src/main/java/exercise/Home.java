package exercise;

// BEGIN
public interface Home {
    double getArea();

    default int compareTo(Home another){
        if (this.getArea() >  another.getArea()){
            return 1;
        }
        if (this.getArea() < another.getArea()){
            return -1;
        }
        return 0;
    }
}

// END
