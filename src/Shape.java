class Shape {

    int getCorner() {
        return 0;
    }
}

class Rectangle extends Shape {
    int getCorner() {
        return 4;
    }

    int getParentCorner() {
        /* super keyword is to access parent class, and to avoided shadowing! */
        return super.getCorner();
    }
}
