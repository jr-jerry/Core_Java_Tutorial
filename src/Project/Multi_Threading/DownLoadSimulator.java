package Project.Multi_Threading;

public class DownLoadSimulator {
    static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(new MovieTask());
        thread1.start();
        Thread thread2=new Thread(new SongTask());
        thread2.start();
        Thread thread3=new Thread(new GameTask());
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println("All Downlaod Complete ");
    }
}
class GameTask implements Runnable{
    @Override
    public void run() {
        System.out.println("\nGame  download start");
        int progress=0;
        int currentProgress=0;
        for(int i=1;i<=25;i++){
            currentProgress=progress+currentProgress;
            System.out.println("Game Progress::::::::::::::::::::: "+currentProgress);

            try {
                Thread.sleep(1000);
                progress=4;


            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Game  download end");
    }
}
class MovieTask implements Runnable{
    @Override
    public void run() {
        System.out.println("\nMovie  download start");
        int progress=0;
        int currentProgress=0;
            for(int i=1;i<=10;i++){
                currentProgress=progress+currentProgress;
                System.out.println("Movie progress ------------------> : "+currentProgress);

                try {
                    Thread.sleep(1000);
                    progress=10;


                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        System.out.println("Movie  download end");
    }
}
class SongTask implements Runnable{
    @Override
    public void run() {
        System.out.println("\nSong  download start");
        int progress=0;
        int currentProgress=0;
        for(int i=1;i<=2;i++){
            currentProgress=progress+currentProgress;
            System.out.println("Song progress =================== "+currentProgress);

            try {
                Thread.sleep(1000);
                progress=50;

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Song  download end");
    }
}
