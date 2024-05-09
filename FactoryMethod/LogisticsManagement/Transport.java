/**
 * Product <<interfaccia>>
 */
public interface Transport {
    float delivery(float km);
    int capacity(int kg);
    void loadCargo();
    void unloadCargo();
}