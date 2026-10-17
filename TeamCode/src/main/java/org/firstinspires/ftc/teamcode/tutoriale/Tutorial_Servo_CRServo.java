package org.firstinspires.ftc.teamcode.tutoriale;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.robot.hardware;

@TeleOp(name="Tutorial_Mecanum_Drive")

public class Tutorial_Servo_CRServo extends LinearOpMode {
    public void runOpMode() throws InterruptedException {

        hardware.initializare(hardwareMap);

        waitForStart();
        double x=0;
        boolean last_cross=false, curr_cross=false, last_circle=false, curr_circle=false;
        while(opModeIsActive() && !isStopRequested())
        {
            x = gamepad2.right_stick_y;
            x = Range.clip((x+1)/2,0,1);
            hardware.servo_cont.setPower(gamepad2.right_trigger-gamepad2.left_trigger);
            hardware.servo1.setPosition(x);
        }
    }

}
