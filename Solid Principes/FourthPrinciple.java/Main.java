// Interface Segregation Principle


class Main{
    public static void main(String[] args) {
        VideoCalling obj = new VideoCalling();
        obj.videoCaller();
        obj.videoPlayer();
        obj.videoRecorder();

        YearCallender obj1 = new YearCallender();
        obj1.displayDayMonthYear();
            
        
        
    }
}