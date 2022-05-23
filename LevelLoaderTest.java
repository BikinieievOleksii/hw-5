class LevelLoaderTest {
    public static void main(String[] args) {
        //Level loaded
        try {
            new ua.goit.module5.part6.LevelLoader().load(new ua.goit.module5.part6.Level(10, 20));
        } catch (ua.goit.module5.part6.LevelTooBigException ex) {
            System.out.println("Level too big");
        }

        //Level too big
        try {
            new ua.goit.module5.part6.LevelLoader().load(new ua.goit.module5.part6.Level(10000, 2000));
        } catch (ua.goit.module5.part6.LevelTooBigException ex) {
            System.out.println("Level too big");
        }
    }
}
class Level {
    private int width;

        private int height;

        public Level(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int getWidth() {
            return width;
        }
    public int getHeight() {
            return height;
        }
    }
class LevelLoader {
    public void load(ua.goit.module5.part6.Level level) throws LevelTooBigException {
            if (level.getHeight() * level.getWidth() > 10000) {
                throw new LevelTooBigException();
            }
            System.out.println("Level loaded");
        }

    }
class LevelTooBigException extends Exception {
    public LevelTooBigException() {
        }
    
    }

