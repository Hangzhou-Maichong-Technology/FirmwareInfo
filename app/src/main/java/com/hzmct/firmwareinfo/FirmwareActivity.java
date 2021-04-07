package com.hzmct.firmwareinfo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.TextView;

import com.android.mc.FirmwareInfo;


public class FirmwareActivity extends AppCompatActivity {
    TextView tvFactory;
    TextView tvProduct;
    TextView tvSpecial;
    TextView tvCpuType;
    TextView tvAndroidVersion;
    TextView tvFirmwareVersion;
    TextView tvFirmwareCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firmware);

        tvFactory = findViewById(R.id.tv_factory);
        tvProduct = findViewById(R.id.tv_product);
        tvSpecial = findViewById(R.id.tv_special);
        tvCpuType = findViewById(R.id.tv_cpu_type);
        tvAndroidVersion = findViewById(R.id.tv_android_version);
        tvFirmwareVersion = findViewById(R.id.tv_firmware_version);
        tvFirmwareCode = findViewById(R.id.tv_firmware_code);

        tvFactory.setText(String.format(getResources().getString(R.string.factory), FirmwareInfo.getFactoryInfo()));
        tvProduct.setText(String.format(getResources().getString(R.string.product), FirmwareInfo.getProductInfo()));
        tvCpuType.setText(String.format(getResources().getString(R.string.cpu_type), FirmwareInfo.getCpuTypeInfo()));
        tvAndroidVersion.setText(String.format(getResources().getString(R.string.android_version), FirmwareInfo.getAndroidVersionInfo()));
        tvFirmwareVersion.setText(String.format(getResources().getString(R.string.firmware_version), FirmwareInfo.getFirmwareVersion()));
        tvFirmwareCode.setText(String.format(getResources().getString(R.string.firmware_code), FirmwareInfo.getFirmwareVersionCode()));

        tvSpecial.setText(String.format(getResources().getString(R.string.special), TextUtils.isEmpty(FirmwareInfo.getSpecialInfo())
                ? "无" : FirmwareInfo.getSpecialInfo()));
    }
}