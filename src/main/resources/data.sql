CREATE TABLE IF NOT EXISTS Users (
    email VARCHAR(255),
    name VARCHAR(255),
    password VARCHAR(255),
    account_id VARCHAR(255)
    );

CREATE TABLE IF NOT EXISTS News (
    id VARCHAR(255),
    title VARCHAR(255),
    body TEXT,
    date_time TIMESTAMP
    );

INSERT INTO News (id, title, body, date_time) VALUES
    ('1', 'El Ministerio de Magia anuncia nuevas medidas de seguridad', 'El Ministerio de Magia ha anunciado hoy un conjunto de nuevas medidas de seguridad en respuesta a los recientes acontecimientos que han sacudido a la comunidad mágica. Estas medidas incluyen la restricción del uso de ciertos hechizos fuera de las horas de toque de queda y el aumento de la presencia de aurores en lugares clave.', '2023-01-01 09:00:00'),
    ('2', 'Quidditch World Cup se aproxima: ¡Prepárate para la acción!', 'El evento más esperado por los aficionados al Quidditch está a la vuelta de la esquina. Equipos de todo el mundo se están preparando para la Copa Mundial de Quidditch que se celebrará este año. La comunidad mágica espera con ansias este espectáculo de agilidad y destreza.', '2023-02-15 10:30:00'),
    ('3', 'El Elixir de la Vida: ¿Realidad o Ficción?', 'Un reciente rumor ha estado circulando en las calles de Knockturn: una poción que puede prolongar la vida indefinidamente. Expertos en pociones advierten a la comunidad mágica que sean escépticos ante tales afirmaciones y recuerdan a todos la importancia de la ética en la elaboración de pociones.', '2023-03-10 14:45:00'),
    ('4', 'La nueva línea de escobas Nimbus: más rápida y ligera que nunca', 'Nimbus ha revelado su última línea de escobas de carreras, prometiendo una experiencia de vuelo más rápida y ligera que nunca. Estas nuevas escobas están equipadas con hechizos mejorados de aerodinámica y un núcleo de galeón de plata para una estabilidad sin precedentes.', '2023-04-05 16:20:00'),
    ('5', 'Descubrimiento de nuevas especies mágicas en el Bosque Prohibido', 'Los magizoólogos de Hogwarts han descubierto varias especies nuevas de criaturas mágicas en las profundidades del Bosque Prohibido. Estas criaturas están siendo estudiadas para entender mejor sus hábitos y cómo pueden coexistir con la comunidad mágica.', '2023-05-21 13:15:00');

INSERT INTO Users (email, name, password, account_id) VALUES
    ('harry.potter@hogwarts.edu', 'Harry Potter', '7h3B0yWh0L1v3d', 'Gryffindor123'),
    ('hermione.granger@hogwarts.edu', 'Hermione Granger', 'L3v10s4', 'Gryffindor123'),
    ('ron.weasley@hogwarts.edu', 'Ron Weasley', '5c4b3rs', 'Gryffindor123'),
    ('draco.malfoy@hogwarts.edu', 'Draco Malfoy', '5lyth3r1n', 'Slytherin456'),
    ('luna.lovegood@hogwarts.edu', 'Luna Lovegood', 'R4d1sh3s', 'Ravenclaw789');

