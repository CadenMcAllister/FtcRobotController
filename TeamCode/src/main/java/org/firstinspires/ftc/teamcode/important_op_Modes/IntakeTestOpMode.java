package org.firstinspires.ftc.teamcode.important_op_Modes;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.IntakeTest;

@Autonomous
public class IntakeTestOpMode extends OpMode {

    final IntakeTest intakeTest = new IntakeTest();

    double power;

    @Override
    public void init(){
        intakeTest.init(hardwareMap);
    }

    @Override
    public void loop(){
        power = 1.0;
        intakeTest.intakeTest(power);
    }

    @Override
    public void stop(){
        intakeTest.intakeTest((0));
    }

}
