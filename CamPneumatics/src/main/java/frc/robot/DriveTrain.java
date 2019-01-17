package frc.robot;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.SPI;

public class DriveTrain {

    Pneumatics pCode = new Pneumatics();
    PowerDistributionPanel pdp = new PowerDistributionPanel();
    AHRS navx;

    int currentCase;
    double rotateToAngleRate;

    public DriveTrain(Pneumatics piston) {
        navx = new AHRS(SPI.Port.kMXP);
        pCode = piston;
        navx.setPIDSourceType(PIDSourceType.kDisplacement);
    }

    public PIDSourceType getPidSourceType() {
        return PIDSourceType.kDisplacement;
    }

    public void setPidSourceType(PIDSourceType pidSource) {

    }
}