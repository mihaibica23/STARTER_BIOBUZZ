package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.robot.functii;
import org.firstinspires.ftc.teamcode.robot.hardware;

@TeleOp(name="Tutorial")
public class tutorial extends LinearOpMode {
    public void runOpMode()
    {
        hardware.initializare(hardwareMap);
        waitForStart();
        while(opModeIsActive() && !isStopRequested())
        {
            //MECANUM DRIVE
            functii.drive_RC(gamepad1.left_stick_x, -gamepad1.left_stick_y, gamepad1.right_stick_x, hardware.fs, hardware.fd, hardware.ss, hardware.sd);

        }
    }
}
