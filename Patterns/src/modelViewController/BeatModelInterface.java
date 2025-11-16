package modelViewController;

interface BeatModelInterface {
    void setBpm(int bpm);
    int getBpm();
    void addObserver(BPMObserver o);
    void removeObserver(BPMObserver o);
}
