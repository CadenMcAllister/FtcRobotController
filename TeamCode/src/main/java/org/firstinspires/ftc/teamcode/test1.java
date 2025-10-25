package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class test1 extends OpMode {
    @Override

    public void init(){
        telemetry.addLine("Hello World");
        telemetry.update();
    }

    @Override
    public void loop(){

    }
}