package GroupProject;

public abstract class Marks {

        public abstract int  getPercentage();
    }
    class A extends Marks {
        int math;
        int english;
        int science;
        A (int math, int english, int science ){
            this.math=math;
            this.english=english;
            this.science=science;
        }
        @Override
        public int getPercentage() {
            int total=(math+english+science)/3;
            return total;
        }
    }
    class B extends A {
        int art;

        B(int math, int english, int science, int art) {
            super(math, english, science);
            this.art = art;
        }

        @Override
        public int getPercentage() {
            int total = (math + english + science + art) / 4;
            return total;
        }

    }
