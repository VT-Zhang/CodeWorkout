public int ticketCost(int speed, boolean firstOffense) {
    if (speed <= 100) {
        return 0;
    }
    if (speed > 100 && speed < 121 && firstOffense) {
        return 105;
    }
    if (speed >= 121 && firstOffense) {
        return 160;
    }
    if (speed >= 101 && !firstOffense) {
        return 200;
    }
    return 0;
}