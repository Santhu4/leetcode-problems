class MyCalendar {
TreeMap<Integer,Integer> tm;
    public MyCalendar() {
        tm = new TreeMap();
    }
    
    public boolean book(int start, int end) {
        Integer prev = tm.floorKey(start),
                next = tm.ceilingKey(start);
                System.out.println(prev);
                 System.out.println(next);
        if((prev == null || tm.get(prev) <= start) && (next == null || end <= next)) {
            tm.put(start,end);
            return true;
        }
        return false;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */