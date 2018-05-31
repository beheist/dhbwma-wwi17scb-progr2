package exceptions.customExceptionClasses;

class NotEnoughFuelException extends Exception {
    public NotEnoughFuelException(double remainingDistance, double requiredDistance) {
        super("Remaining fuel is only sufficient for " + remainingDistance + " km; you wanted " + requiredDistance);
    }
}
