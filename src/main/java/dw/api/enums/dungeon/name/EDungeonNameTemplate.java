package dw.api.enums.dungeon.name;

public enum EDungeonNameTemplate {
        TEMPLATE_1("The [PLACE]"),
        TEMPLATE_2("(The) [ADJECTIVE] [PLACE]"),
        TEMPLATE_3("(The) [PLACE] of the [NOUN]"),
        TEMPLATE_4("(The) [NOUN]'s [PLACE]"),
        TEMPLATE_5("[PLACE] of the [ADJECTIVE] [NOUN]"),
        TEMPLATE_6("(The) [ADJECTIVE] [NOUN]");

        private final String template;
        EDungeonNameTemplate(String template){
            this.template = template;
        }
        public String getTemplate(){
            return template;
        }
}
