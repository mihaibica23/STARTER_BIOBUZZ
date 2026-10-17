package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.robot.functii;
import org.firstinspires.ftc.teamcode.robot.hardware;

@TeleOp(name="Tutorial")

public class tutorial extends LinearOpMode {
    public void runOpMode() throws InterruptedException {

        hardware.initializare(hardwareMap);

        waitForStart();
        double x=0;
        boolean last_cross=false, curr_cross=false, last_circle=false, curr_circle=false;
        while(opModeIsActive() && !isStopRequested())
        {
            //DRIVE MECANUM
        }
    }

}
