package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class ChartController extends JsObject {

    
    private String type;
    private Boolean useCapture;

    public void setListen(String type, Boolean useCapture) {
        this.type = type;
        this.useCapture = useCapture;
    }

    private String type1;
    private Boolean useCapture1;

    public void setListenonce(String type1, Boolean useCapture1) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
        this.useCapture = null;
        this.useCapture1 = null;
        
        this.useCapture1 = useCapture1;
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
    }

    private AnnotationsBase annotation;

    public void setRemoveannotation(AnnotationsBase annotation) {
        this.annotation = annotation;
    }

    private AnnotationsBase annotation1;

    public void setSelect(AnnotationsBase annotation1) {
        this.annotation = null;
        this.annotation1 = null;
        
        this.annotation1 = annotation1;
    }

    private AnnotationTypes annotationTypeOrConfig;
    private AnnotationJSONFormat annotationTypeOrConfig1;

    public void setStartdrawing(AnnotationTypes annotationTypeOrConfig) {
        this.annotationTypeOrConfig = null;
        this.annotationTypeOrConfig1 = null;
        
        this.annotationTypeOrConfig = annotationTypeOrConfig;
    }


    public void setStartdrawing(AnnotationJSONFormat annotationTypeOrConfig1) {
        this.annotationTypeOrConfig = null;
        this.annotationTypeOrConfig1 = null;
        
        this.annotationTypeOrConfig1 = annotationTypeOrConfig1;
    }

    private String type3;
    private Boolean useCapture2;

    public void setUnlisten(String type3, Boolean useCapture2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        
        this.type3 = type3;
        this.useCapture = null;
        this.useCapture1 = null;
        this.useCapture2 = null;
        
        this.useCapture2 = useCapture2;
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", type);
        }
        return "";
    }

    private String generateJSuseCapture() {
        if (useCapture != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", type1);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJSannotation() {
        if (annotation != null) {
            return String.format(Locale.US, "annotation: %s,", (annotation != null) ? annotation.generateJs() : "null");
        }
        return "";
    }

    private String generateJSannotation1() {
        if (annotation1 != null) {
            return String.format(Locale.US, "annotation: %s,", (annotation1 != null) ? annotation1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSannotationTypeOrConfig() {
        if (annotationTypeOrConfig != null) {
            return String.format(Locale.US, "annotationTypeOrConfig: %s,", (annotationTypeOrConfig != null) ? annotationTypeOrConfig.generateJs() : "null");
        }
        return "";
    }

    private String generateJSannotationTypeOrConfig1() {
        if (annotationTypeOrConfig1 != null) {
            return String.format(Locale.US, "annotationTypeOrConfig: %s,", (annotationTypeOrConfig1 != null) ? annotationTypeOrConfig1.generateJs() : "null");
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: %s,", type3);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJStype2());
        js.append(generateJSannotation());
        js.append(generateJSannotation1());
        js.append(generateJSannotationTypeOrConfig());
        js.append(generateJSannotationTypeOrConfig1());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}