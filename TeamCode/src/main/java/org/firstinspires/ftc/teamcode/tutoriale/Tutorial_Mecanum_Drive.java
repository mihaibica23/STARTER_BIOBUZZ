package org.firstinspires.ftc.teamcode.tutoriale;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.robot.functii;
import org.firstinspires.ftc.teamcode.robot.hardware;

@TeleOp(name="Tutorial_Mecanum_Drive")

public class Tutorial_Mecanum_Drive extends LinearOpMode {
    public void runOpMode() throws InterruptedException {

        hardware.initializare(hardwareMap);

        waitForStart();
        double x=0;
        boolean last_cross=false, curr_cross=false, last_circle=false, curr_circle=false;
        while(opModeIsActive() && !isStopRequested())
        {
            //DRIVE MECANUM
            functii.drive_RC(gamepad1.left_stick_x,gamepad1.left_stick_y,gamepad1.right_stick_x, hardware.fs, hardware.fd, hardware.ss, hardware.sd);
        }
    }

}
