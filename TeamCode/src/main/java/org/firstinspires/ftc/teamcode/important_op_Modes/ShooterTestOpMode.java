package org.firstinspires.ftc.teamcode.important_op_Modes;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import org.firstinspires.ftc.teamcode.mechanisms.LauncherTest;

@Autonomous
public class ShooterTestOpMode extends OpMode {

    final LauncherTest shootTest = new LauncherTest();
    double power;

    @Override
    public void init(){
        shootTest.init(hardwareMap);
    }

    @Override
    public void loop(){
        power = 1.0;
        shootTest.shootTest(power);
    }

    @Override
    public void stop(){
        // Ensure motor is stopped when OpMode ends
        shootTest.shootTest(0.0);
    }
}
