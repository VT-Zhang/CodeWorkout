public int caughtSpeeding(int speed, boolean isBirthday)
{    
    int ticket = 0; 
    if (speed <= 60) {
        ticket = 0;
    }
    else if (speed <= 65 && isBirthday) {
        ticket = 0;
    }
    else if (speed >= 61 && speed <= 80) {
        ticket = 1;
    }
    else if (speed >= 66 && speed <= 85 && isBirthday) {
        ticket = 1;
    }
    else if (speed >= 81) {
        ticket = 2;
    }
    else if (speed >= 86 && isBirthday) {
        ticket = 2;
    }
    
    return ticket;
}