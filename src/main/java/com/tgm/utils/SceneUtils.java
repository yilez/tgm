/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tgm.utils;

import com.tgm.resources.TgmResource;
import java.io.File;
import java.nio.file.Path;
import org.apache.log4j.Logger;

/**
 *
 * @author christopher
 */
public class SceneUtils {
    
    public static Path readMedia(String media) {
        File f = new File(TgmResource.MEDIA + "/" + media);
        Logger.getLogger(SceneUtils.class).info("LOAD RESOURCE: [" + TgmResource.MEDIA + "/" + media + "] = " + f.getAbsolutePath());
        return f.toPath();
    }
    
}
