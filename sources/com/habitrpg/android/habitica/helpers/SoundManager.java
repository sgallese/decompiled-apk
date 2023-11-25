package com.habitrpg.android.habitica.helpers;

import ad.l0;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import qc.q;

/* compiled from: SoundManager.kt */
/* loaded from: classes4.dex */
public final class SoundManager {
    public static final String SoundAchievementUnlocked = "Achievement_Unlocked";
    public static final String SoundChat = "Chat";
    public static final String SoundDaily = "Daily";
    public static final String SoundDeath = "Death";
    public static final String SoundItemDrop = "Item_Drop";
    public static final String SoundLevelUp = "Level_Up";
    public static final String SoundMinusHabit = "Minus_Habit";
    public static final String SoundPlusHabit = "Plus_Habit";
    public static final String SoundReward = "Reward";
    public static final String SoundThemeOff = "off";
    public static final String SoundTodo = "Todo";
    private final Map<String, SoundFile> loadedSoundFiles;
    private SoundFileLoader soundFileLoader;
    private String soundTheme;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SoundManager.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }
    }

    public SoundManager(SoundFileLoader soundFileLoader) {
        q.i(soundFileLoader, "soundFileLoader");
        this.soundFileLoader = soundFileLoader;
        this.soundTheme = SoundThemeOff;
        this.loadedSoundFiles = new HashMap();
    }

    public final SoundFileLoader getSoundFileLoader() {
        return this.soundFileLoader;
    }

    public final String getSoundTheme() {
        return this.soundTheme;
    }

    public final void loadAndPlayAudio(String str) {
        q.i(str, TaskFormActivity.TASK_TYPE_KEY);
        if (q.d(this.soundTheme, SoundThemeOff)) {
            return;
        }
        if (this.loadedSoundFiles.containsKey(str)) {
            SoundFile soundFile = this.loadedSoundFiles.get(str);
            if (soundFile != null) {
                soundFile.play();
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SoundFile(this.soundTheme, str));
        ExceptionHandlerKt.launchCatching$default(l0.b(), null, new SoundManager$loadAndPlayAudio$1(this, arrayList, str, null), 1, null);
    }

    public final void preloadAllFiles() {
        this.loadedSoundFiles.clear();
        if (q.d(this.soundTheme, SoundThemeOff)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SoundFile(this.soundTheme, SoundAchievementUnlocked));
        arrayList.add(new SoundFile(this.soundTheme, SoundChat));
        arrayList.add(new SoundFile(this.soundTheme, SoundDaily));
        arrayList.add(new SoundFile(this.soundTheme, SoundDeath));
        arrayList.add(new SoundFile(this.soundTheme, SoundItemDrop));
        arrayList.add(new SoundFile(this.soundTheme, SoundLevelUp));
        arrayList.add(new SoundFile(this.soundTheme, SoundMinusHabit));
        arrayList.add(new SoundFile(this.soundTheme, SoundPlusHabit));
        arrayList.add(new SoundFile(this.soundTheme, SoundReward));
        arrayList.add(new SoundFile(this.soundTheme, SoundTodo));
        ExceptionHandlerKt.launchCatching$default(l0.b(), null, new SoundManager$preloadAllFiles$1(this, arrayList, null), 1, null);
    }

    public final void setSoundFileLoader(SoundFileLoader soundFileLoader) {
        q.i(soundFileLoader, "<set-?>");
        this.soundFileLoader = soundFileLoader;
    }

    public final void setSoundTheme(String str) {
        q.i(str, "<set-?>");
        this.soundTheme = str;
    }
}
