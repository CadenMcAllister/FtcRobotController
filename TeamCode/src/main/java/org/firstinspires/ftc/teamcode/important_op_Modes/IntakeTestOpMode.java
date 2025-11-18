package org.firstinspires.ftc.teamcode.important_op_Modes;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.mechanisms.IntakeClass;

@Autonomous
public class IntakeTestOpMode extends OpMode {

    final IntakeClass intakeClass = new IntakeClass();

    double power;

    @Override
    public void init(){
        intakeClass.init(hardwareMap);
    }

    @Override
    public void loop(){
        power = 1.0;
        intakeClass.intakeFunc(power);
    }

    @Override
    public void stop(){
        intakeClass.intakeFunc((0));
    }

}
