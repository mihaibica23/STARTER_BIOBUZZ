package org.firstinspires.ftc.teamcode.robot;

import com.qualcomm.robotcore.hardware.DcMotor;

public class functii {
    // FUNCTIE DRIVE ROBOT CENTRIC
    public static void drive_RC(double x, double y, double rotate, DcMotor fata_stanga, DcMotor fata_dreapta, DcMotor spate_stanga, DcMotor spate_dreapta)
    {
        double denominator = Math.max(Math.abs(y) + Math.abs(x) + Math.abs(rotate), 1);
        fata_stanga.setPower((y + x + rotate) / denominator);
        spate_stanga.setPower((y - x + rotate) / denominator);
        fata_dreapta.setPower((y - x - rotate) / denominator);
        spate_dreapta.setPower((y + x - rotate) / denominator);
    }
}

