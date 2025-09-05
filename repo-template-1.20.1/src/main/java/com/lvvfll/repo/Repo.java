package com.example.repo; // 你的包名

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib; // 导入 GeckoLib

public class Repo implements ModInitializer {
    // 这在 Fabric 的所有实例中运行。
    // 请注意，客户端和服务器代码都在这里运行！

    public static final String MOD_ID = "repo"; // 你的 Mod ID
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        // 这是你的模组在加载时运行的第一个东西。
        // 你可以记录一个消息，等等。
        LOGGER.info("Hello Fabric world!");

        // 初始化 GeckoLib
        GeckoLib.initialize(); // 添加这行
    }
}