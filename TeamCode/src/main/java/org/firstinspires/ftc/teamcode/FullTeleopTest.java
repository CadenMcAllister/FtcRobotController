// java
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.ArcadeDrive;
import org.firstinspires.ftc.teamcode.testBench.LauncherTest;

@TeleOp
public class FullTeleopTest extends OpMode {
    private final LauncherTest shootTest = new LauncherTest();
    private final ArcadeDrive drive = new ArcadeDrive();

    private boolean shooting = false;
    private boolean prevA = false;

    @Override
    public void init() {
        shootTest.init(hardwareMap);
        drive.init(hardwareMap);
    }

    @Override
    public void loop() {
        // Toggle shooter on rising edge of A
        if (gamepad1.a && !prevA) {
            shooting = !shooting;
        }
        prevA = gamepad1.a;

        // Apply shooter power from toggle state
        double shooterPower = shooting ? 1.0 : 0.0;
        shootTest.shootTest(shooterPower);

        // Drive controls
        double throttle = -gamepad1.left_stick_y;
        double spin = gamepad1.left_stick_x;
        drive.drive(throttle, spin);

        // Telemetry for debugging
        telemetry.addData("Shooter", shooting ? "ON" : "OFF");
        telemetry.update();
    }

    @Override
    public void stop() {
        // Ensure all outputs are zeroed when OpMode stops
        shootTest.shootTest(0.0);
        drive.drive(0.0, 0.0);
    }
}
