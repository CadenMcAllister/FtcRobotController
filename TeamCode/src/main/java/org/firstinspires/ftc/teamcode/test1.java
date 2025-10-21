package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class test1 extends OpMode {
    private DcMotor motor;

    @Override
    public void init() {
        // Replace "left_drive" with the exact name used in the robot config
        motor = hardwareMap.get(DcMotor.class, "left_drive");
        motor.setDirection(DcMotorSimple.Direction.FORWARD);
        motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        telemetry.addData("Status", "Initialized");
        telemetry.update();
    }

    @Override
    public void start() {
        // start spinning continuously at full power; change to desired power (0.0 - 1.0)
        motor.setPower(1.0);
    }

    @Override
    public void loop() {
        telemetry.addData("Motor Power", motor.getPower());
        telemetry.update();
    }

    @Override
    public void stop() {
        // stop the motor when the OpMode stops
        motor.setPower(0.0);
    }
}