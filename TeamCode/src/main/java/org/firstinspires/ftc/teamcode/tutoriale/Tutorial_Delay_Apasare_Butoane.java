package org.firstinspires.ftc.teamcode.tutoriale;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.robot.functii;
import org.firstinspires.ftc.teamcode.robot.hardware;

@TeleOp(name="Tutorial_Mecanum_Drive")

public class Tutorial_Delay_Apasare_Butoane extends LinearOpMode {
    public void runOpMode() throws InterruptedException {

        hardware.initializare(hardwareMap);

        waitForStart();
        double x=0;
        boolean last_cross=false, curr_cross=false, last_circle=false, curr_circle=false;
        while(opModeIsActive() && !isStopRequested())
        {
            last_cross=curr_cross;
            curr_cross= gamepad1.cross;
            if(curr_cross==true && last_cross==false)
            {
                x=x+0.2;
                x = Range.clip(x,0,1);
            }
            last_circle=curr_circle;
            curr_circle= gamepad1.circle;
            if(curr_circle==true && last_circle==false)
            {
                x=x-0.2;
                x = Range.clip(x,0,1);
            }
        }
    }

}
