package com.company.Java5;

/**
 * Created by Документи on 14.02.2017.
 */
public class Plants {
    int size;
    Color color;
    Type type;

    public Plants(int size, String color, String type) throws ColorException, TypeException, SizeException {
        if (size <= 0) throw new SizeException("Value of size is nonsense. It has be more zero.");
        else this.size = size;
        this.color = colorToEnum(color);
        this.type = typeToEnum(type);
    }

    public Color colorToEnum(String color) throws ColorException {
        switch (color.toLowerCase()) {
            case "green" : return Color.Green;
            case "blue" :  return Color.Blue;
            case "brown" : return Color.Brown;
            case "orange" : return Color.Orange;
            case "red" :   return Color.Red;
            case "white" : return Color.White;
            case "yellow" : return Color.Yellow;
            default : throw new ColorException("Input only one of colors: green, blue, brown, orange, red, white, yellow");
        }
    }
    public Type typeToEnum(String type) throws TypeException {
        switch (type.toLowerCase()) {
            case "bush" : return Type.Bush;
            case "cactus" : return Type.Cactus;
            case "tree" : return Type.Tree;
            case "cereal" : return Type.Cereal;
            case "grass" : return Type.Grass;
            default : throw new TypeException("Input only one of types: bush, cactus, tree, cereal, grass");
        }
    }

    @Override
    public String toString(){
        return "Type is: " + type + ". Color is: " + color + ". Size is: " + size;
    }

    public static void main(String[] args) {
        try {
            Plants[] plants = new Plants[5];
            plants[0] = new Plants(1, "red", "bush");
            plants[1] = new Plants(2, "blue", "grass");
            plants[2] = new Plants(3, "white", "tree");
            plants[3] = new Plants(4, "brown", "cactus");
            plants[4] = new Plants(5, "orange", "cereal");
            for (int i = 0; i < plants.length; i++) {
                System.out.println(plants[i]);
            }
        }
        catch (TypeException | ColorException | SizeException e) {
            System.err.println(e.getMessage() + "\n");
        }
    }
}
