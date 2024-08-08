package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class DriveTest extends OpMode {

    double speed = 0.2;

    //Declare Objects
    DcMotor backLeft;
    DcMotor backRight;
    DcMotor frontLeft;
    DcMotor frontRight;

    @Override
    public void init() {
        //Setup Objects
        backLeft = hardwareMap.get(DcMotor.class, "backLeft");
        backRight = hardwareMap.get(DcMotor.class, "backRight");
        frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
        frontRight = hardwareMap.get(DcMotor.class, "frontRight");

    }


    @Override
    public void loop() {

        //Use Gamepad input to control motor
        if(gamepad1.y){
            backLeft.setPower(-speed);
            backRight.setPower(speed);
            frontLeft.setPower(-speed);
            frontRight.setPower(speed);
        }
        else if (gamepad1.a) {
            backLeft.setPower(speed);
            backRight.setPower(-speed);
            frontLeft.setPower(speed);
            frontRight.setPower(-speed);

        } else {
            //set power back to zero
            backLeft.setPower(0);
            backRight.setPower(0);
            frontLeft.setPower(0);
            frontRight.setPower(0);
        }

    }
}
