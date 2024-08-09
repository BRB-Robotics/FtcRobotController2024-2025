package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class DriveTest extends OpMode {

    double speed = 0.5;
    //Declare Objects
    DcMotor backLeft;
    DcMotor frontLeft;
    DcMotor frontRight;
    DcMotor backRight;

    @Override
    public void init() {
        //Set up objects(DC Motors)
        backLeft = hardwareMap.get(DcMotor.class, "back left");
        frontLeft = hardwareMap.get(DcMotor.class, "front left");
        frontRight = hardwareMap.get(DcMotor.class, "front right");
        backRight = hardwareMap.get(DcMotor.class, "back right");
    }

    @Override
    public void loop() {
        double speedx = (gamepad1.left_stick_x) / 2;
        double speedy = (gamepad1.left_stick_y) / 2;
        backLeft.setPower(-speedx);
        frontLeft.setPower(-speedx);
        frontRight.setPower(speedx);
        backRight.setPower(speedx);
        backLeft.setPower(speedy);
        frontLeft.setPower(speedy);
        frontRight.setPower(speedy);
        backRight.setPower(speedy);
    }
}

