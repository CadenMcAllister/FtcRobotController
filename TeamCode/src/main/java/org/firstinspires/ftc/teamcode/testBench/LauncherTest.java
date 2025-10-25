package org.firstinspires.ftc.teamcode.testBench;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;


public class LauncherTest {
    private DcMotor shooterMotor;

    public void init(HardwareMap hwMap) {
        shooterMotor = hwMap.get(DcMotor.class, "shooter_motor");
        shooterMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    public void shootTest(double power){
        // Set the power for the shooter motor between -1.0 and 1.0
        shooterMotor.setPower(power);
    }
}
